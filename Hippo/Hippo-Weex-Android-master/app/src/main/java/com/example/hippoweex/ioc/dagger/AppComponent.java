package com.example.hippoweex.ioc.dagger;

import android.content.Context;

import com.example.core.network.service.ApiService;
import com.example.hippoweex.Navigator;
import com.example.hippoweex.ioc.ApiServiceModule;

import dagger.Component;

/**
 * Created by dell on 2016/9/20.
 */
@PerApplication
@Component(modules = {AppModule.class, ApiServiceModule.class})
public interface AppComponent {
    Context getContext();
    Navigator getNavigator();
    ApiService getService();
}
