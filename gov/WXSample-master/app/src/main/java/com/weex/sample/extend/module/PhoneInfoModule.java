package com.weex.sample.extend.module;

import android.content.Intent;
import android.os.Build;
import android.view.Menu;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixinke on 2017/3/3.
 */

public class PhoneInfoModule extends WXModule {

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        System.out.println("------onActivityResult-------");
    }

    public void onActivityCreate() {
        System.out.println("------onActivityCreate-------");
    }

    public void onActivityStart() {
        System.out.println("------onActivityStart-------");
    }

    public void onActivityPause() {
        System.out.println("------onActivityPause-------");
    }

    public void onActivityResume() {
        System.out.println("------onActivityResume-------");
    }

    public void onActivityStop() {
        System.out.println("------onActivityStop-------");
    }

    public void onActivityDestroy() {
        System.out.println("------onActivityDestroy-------");
    }

    public boolean onActivityBack() {
        System.out.println("------onActivityBack-------");
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        System.out.println("------onCreateOptionsMenu-------");
        return false;
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        System.out.println("------onRequestPermissionsResult-------");
    }


    @JSMethod(uiThread = false)
    public void getPhoneInfo(JSCallback callback) {
        System.out.println("-----getPhoneInfo----");
        Map<String, String> infos = new HashMap<>();
        infos.put("board", Build.BOARD);
        infos.put("brand", Build.BRAND);
        infos.put("device", Build.DEVICE);
        infos.put("model", Build.MODEL);
        callback.invoke(infos);
    }
}
