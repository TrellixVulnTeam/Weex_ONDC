package com.wjz.weexSupport;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.Toast;

import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import com.wjz.Conf;
import com.wjz.activity.HomeActivity;
import com.wjz.activity.WeexActivity2;

/**
 * 自定义事件
 */
public class WXEventModule extends WXModule {


    /**
     * @param msg
     */
    @WXModuleAnno(runOnUIThread = true)
    public void gotoedit(String msg) {
        if (mWXSDKInstance.getContext() instanceof Activity) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse(Conf.URL + "modules/send.js");
            intent.setData(uri);
            intent.addCategory("com.taobao.android.intent.category.WEEX");
            intent.setPackage(mWXSDKInstance.getContext().getPackageName());
            mWXSDKInstance.getContext().startActivity(intent);
        }
    }

    /**
     * about 事件
     */
    @WXModuleAnno(runOnUIThread = true)
    public void gotoabout() {
        if (mWXSDKInstance.getContext() instanceof Activity) {
            Intent intent = new Intent(mWXSDKInstance.getContext(), WeexActivity2.class);
            mWXSDKInstance.getContext().startActivity(intent);
        }
    }

    /**
     * 返回主页事件
     *
     * @param msg
     */
    @WXModuleAnno(runOnUIThread = true)
    public void backtohome(String msg) {
        if (mWXSDKInstance.getContext() instanceof Activity) {
            ((Activity) mWXSDKInstance.getContext()).finish();
        }
    }

    /**
     * comment
     *
     * @param obj
     * @param content
     */
    @WXModuleAnno(runOnUIThread = true)
    public void comment(String obj, String content) {
        if (mWXSDKInstance.getContext() instanceof Activity) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse(Conf.URL + "modules/comment.js");
            intent.setData(uri);
            intent.addCategory("com.taobao.android.intent.category.WEEX");
            intent.setPackage(mWXSDKInstance.getContext().getPackageName());
            mWXSDKInstance.getContext().startActivity(intent);
        }
    }

    /**
     * 分享事件
     *
     * @param msg
     */
    @WXModuleAnno(runOnUIThread = true)
    public void share(String msg) {

        if (mWXSDKInstance.getContext() instanceof Activity) {
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT, msg);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "好友分享");
            shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            mWXSDKInstance.getContext().startActivity(Intent.createChooser(shareIntent, "分享到"));
        }
    }


    /**
     * 保存sp 事件 打开 home 页
     *
     * @param name
     * @param pass
     */
    @WXModuleAnno(runOnUIThread = true)
    public void sp(String name, String pass) {
        if (mWXSDKInstance.getContext() instanceof Activity) {
            // 拿到 weex 传递过来的数据 存入  sp
            SharedPreferences sp = mWXSDKInstance.getContext().getSharedPreferences("userinfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor edit = sp.edit();
            edit.putString("username", name);
            edit.putString("password", pass);
            edit.commit();
            // 去首页
            Intent intent = new Intent(mWXSDKInstance.getContext(), HomeActivity.class);
            mWXSDKInstance.getContext().startActivity(intent);
        }
    }

    /**
     * 显示sp 事件
     */
    @WXModuleAnno(runOnUIThread = true)
    public void showsp() {

        if (mWXSDKInstance.getContext() instanceof Activity) {
            SharedPreferences sp = mWXSDKInstance.getContext().getSharedPreferences("userinfo", Context.MODE_PRIVATE);
            String a = sp.getString("username", "default");
            Toast.makeText(mWXSDKInstance.getContext(), a, Toast.LENGTH_LONG).show();
        }

    }

    /**
     * 退出事件
     */
    @WXModuleAnno(runOnUIThread = true)
    public void quit() {
        if (mWXSDKInstance.getContext() instanceof Activity) {
            SharedPreferences sp = mWXSDKInstance.getContext().getSharedPreferences("userinfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor edit = sp.edit();
            edit.putString("username", "");
            edit.putString("password", "");
            edit.commit();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = Uri.parse(Conf.URL + "login.js");
            intent.setData(uri);
            intent.addCategory("com.taobao.android.intent.category.WEEX");
            intent.setPackage(mWXSDKInstance.getContext().getPackageName());
            mWXSDKInstance.getContext().startActivity(intent);
            ((Activity) mWXSDKInstance.getContext()).finish();
        }
    }

    /**
     * 上传图片事件
     */
    @WXModuleAnno(runOnUIThread = true)
    public void uploadimage() {
        int REQUESTCODE_PICK = 0;
        Intent intent;
        if (Build.VERSION.SDK_INT < 19) {
            Log.d(" api level", "Your api is lower than 19");
            intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("image/*");
        } else {
            Log.d(" api level", "Your api is higher than 19");
            intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }

        System.out.println("启动 相册");
        ((Activity) mWXSDKInstance.getContext()).startActivityForResult(intent, REQUESTCODE_PICK);
    }
}
