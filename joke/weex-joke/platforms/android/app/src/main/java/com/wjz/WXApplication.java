package com.wjz;

import android.app.Application;

import com.alibaba.weex.commons.adapter.ImageAdapter;
import com.wjz.weexSupport.WXEventModule;
import com.avos.avoscloud.AVOSCloud;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.wjz.weexSupport.MyInput;

public class WXApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    AVOSCloud.initialize(this,"zksrg6fpR18GjAsv0eHPs4Kz-gzGzoHsz","XfkYkvCvsJ1FkhEqzdTsMnNC");

    InitConfig config = new InitConfig.Builder()
            .setImgAdapter(new ImageAdapter()).build();
    WXSDKEngine.initialize(this,config);
    try{
      // 注册事件监听
      WXSDKEngine.registerModule("myModule", WXEventModule.class);
      // 注册自定义组建
      WXSDKEngine.registerComponent("myinput", MyInput.class);
    }catch (WXException e){
      e.printStackTrace();
    }
  }


}
