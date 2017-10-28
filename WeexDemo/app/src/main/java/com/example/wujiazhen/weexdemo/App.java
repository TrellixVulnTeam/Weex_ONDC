package com.example.wujiazhen.weexdemo;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by wujiazhen on 2017/6/12.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WXSDKEngine.initialize(this,
                new InitConfig.Builder()
                        .setImgAdapter(new ImageAdapter())
                .build()
        );
    }
}
