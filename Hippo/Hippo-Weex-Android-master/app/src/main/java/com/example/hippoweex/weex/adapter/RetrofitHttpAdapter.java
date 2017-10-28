package com.example.hippoweex.weex.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.example.core.HttpResultFunc;
import com.example.core.HttpSubscriber;
import com.example.core.exception.ApiException;
import com.example.core.exception.ERROR;
import com.example.core.manager.UserManager;
import com.example.core.model.Result;
import com.example.core.network.retrofit.OkHttpUtils;
import com.example.core.network.retrofit.RetrofitUtils;
import com.example.core.utils.GsonTools;
import com.example.hippoweex.Navigator;
import com.example.hippoweex.ui.view.SimpleBackPage;
import com.example.hippoweex.weex.WeexIntercepter;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.common.WXRequest;
import com.taobao.weex.common.WXResponse;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by dell on 2016/8/19.
 */
public class RetrofitHttpAdapter implements IWXHttpAdapter {
    private Navigator navigator;
    private Context context;

    public RetrofitHttpAdapter(Context context){
        this.context = context;
        this.navigator = new Navigator();
    }

    public WXHttpService getService(OnHttpListener listener) {
        OkHttpClient okHttpClient = OkHttpUtils.getDefaultBuild(context)
                .addInterceptor(new WeexIntercepter(listener))
                .build();
        return RetrofitUtils.getDefaultBuild(context).client(okHttpClient).build().create(WXHttpService.class);
    }

    /**
     * retrofit 的接口
     */
    interface WXHttpService{
        /**
         * Token
         *  @Header("x-token") 本地填写
         * Post ：以json形式传递参数
         *  @Headers({"Content-Type: application/json"})
         *  @Body Map<String, Object> params
         * Get
         *  @QueryMap Map<String,Object> querys
         */
        @POST
        Observable<Result<JSONObject>> postRequest(@Url String url, @HeaderMap Map<String, String> headers, @Body Map<String, Object> params);

        @GET
        Observable<Result<JSONObject>> getRequest(@Url String url, @HeaderMap Map<String, String> headers, @QueryMap Map<String, Object> params);
    }

    @Override
    public void sendRequest(WXRequest request, OnHttpListener listener) {

        System.out.println("sendRequest:    我被调用了！！");

        System.out.println("request:   "+JSON.toJSONString(request));

        /*
        {
        "method":"GET","paramMap":{},
        "timeoutMs":3000,
        "url":"http://114.55.30.104:8090/service/useropt/UserOptServiceImpl/myInfo"
        }
        * */

        if(listener != null){
            listener.onHttpStart();
        }
        WXResponse response = new WXResponse();

        WXHttpService requestApi = getService(listener);
        //添加请求消息头
        Map<String,String>  headers = request.paramMap;

        //添加请求参数
        Map<String,Object> params = new HashMap<>();
        if(!TextUtils.isEmpty(request.body)){
            params = GsonTools.convertJsonToNestMap(request.body);
        }

        //默认所有接口都会添加token
        headers.put("x-token", UserManager.readUserToken(context).toString());
        //所有请求默认附加token,没有Token默认跳转首页
        if ("POST".equals(request.method) || "PUT".equals(request.method) || "PATCH".equals(request.method)) {
            //post请求分为表单数据提交和json数据提交两种方式
            requestApi.postRequest(request.url, headers, params)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .onErrorResumeNext(new HttpResultFunc<Observable<? extends Result<JSONObject>>>())
                    .subscribe(new WeexSubscriber(response, listener));
        }else {
            //默认get
            requestApi.getRequest(request.url, headers, params)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .onErrorResumeNext(new HttpResultFunc<Observable<? extends Result<JSONObject>>>())
                    .subscribe(new WeexSubscriber(response, listener));
        }

        /*
06-07 16:12:36.286 17972-24687/com.example.hippoweex D/OkHttp: --> GET http://114.55.30.104:8090/service/useropt/UserOptServiceImpl/myInfo http/1.1
06-07 16:12:36.287 17972-24687/com.example.hippoweex D/OkHttp: x-token:
06-07 16:12:36.287 17972-24687/com.example.hippoweex D/OkHttp: --> END GET
06-07 16:12:36.673 17972-24687/com.example.hippoweex D/OkHttp: <-- 402 Payment Required http://114.55.30.104:8090/service/useropt/UserOptServiceImpl/myInfo (385ms)
06-07 16:12:36.673 17972-24687/com.example.hippoweex D/OkHttp: Server: Apache-Coyote/1.1
06-07 16:12:36.673 17972-24687/com.example.hippoweex D/OkHttp: Access-Control-Allow-Origin: *
06-07 16:12:36.673 17972-24687/com.example.hippoweex D/OkHttp: Access-Control-Allow-Methods: POST, PUT, GET, OPTIONS, DELETE, HEAD
06-07 16:12:36.673 17972-24687/com.example.hippoweex D/OkHttp: Access-Control-Max-Age: 3600
06-07 16:12:36.673 17972-24687/com.example.hippoweex D/OkHttp: Access-Control-Allow-Headers: x-token,Content-Type,X-Requested-With,Accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers, HTTP_CONSUMER_KEY, HTTP_DEVICE_ID, HTTP_SIGNATURE, HTTP_ACCESS_TOKEN, HTTP_TIMESTAMP
06-07 16:12:36.674 17972-24687/com.example.hippoweex D/OkHttp: Content-Type: application/json;charset=UTF-8
06-07 16:12:36.674 17972-24687/com.example.hippoweex D/OkHttp: Content-Length: 0
06-07 16:12:36.674 17972-24687/com.example.hippoweex D/OkHttp: Date: Wed, 07 Jun 2017 08:16:53 GMT

        * */


    }

    //异常流分发
    class WeexSubscriber extends HttpSubscriber<Result<JSONObject>> {
        private OnHttpListener listener;
        private WXResponse response;

        public WeexSubscriber(WXResponse response, OnHttpListener listener) {
            this.response = response;
            this.listener = listener;
        }

        @Override
        protected void onError(ApiException ex) {
            if (ex.getCode() == ERROR.TOKEN_EXPIRE) {
                onTokenExpire(ex);
            } else {
                onApiException(ex);
            }
        }

        @Override
        public void onCompleted() {

        }

        @Override
        public void onNext(Result<JSONObject> result) {
            response.statusCode = String.valueOf(result.getCode());
            response.originalData=result.getData().toString().getBytes();
            if(listener!=null){
                listener.onHttpFinish(response);
            }
        }

        // 异常
        protected void onTokenExpire(ApiException ex) {
            //如果token过期, 处理跳转到登录界面
            navigator.pushSimpleBackPage(context, SimpleBackPage.LOGIN_FRAGMENT);
        }

        protected void onApiException(ApiException ex) {
            //本地拦截异常信息流,打印
            Toast.makeText(context,ex.getDisplayMessage(),Toast.LENGTH_SHORT).show();
            response.statusCode = "-1";
            response.errorCode=String.valueOf(ex.getCode());
            response.errorMsg=ex.getDisplayMessage();
        }
    }


    public Context getContext(){
        return this.context;
    }

}
