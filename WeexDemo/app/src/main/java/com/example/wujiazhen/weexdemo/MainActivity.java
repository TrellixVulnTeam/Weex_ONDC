package com.example.wujiazhen.weexdemo;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity implements IWXRenderListener{

    private FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl = (FrameLayout) findViewById(R.id.fl);

        WXSDKInstance instance = new WXSDKInstance(getApplication());
        instance.registerRenderListener(this);
        
        instance.renderByUrl("bundleUrl",
                "http://10.0.2.2:13456/dist/test.js",
                null,
                null,
                getDisplayWidth(this),
                getDisplayHeight(this),
                WXRenderStrategy.APPEND_ASYNC);
    }

    public  int getDisplayWidth(Activity activity){
        int width=0;
        if (activity != null && activity.getWindowManager() != null && activity.getWindowManager().getDefaultDisplay() != null) {
            Point point=new Point();
            activity.getWindowManager().getDefaultDisplay().getSize(point);
            width = point.x;
        }
        return width;
    }

    public  int getDisplayHeight(Activity activity) {
        int height = 0;
        if (activity != null && activity.getWindowManager() != null && activity.getWindowManager().getDefaultDisplay() != null) {
            Point point=new Point();
            activity.getWindowManager().getDefaultDisplay().getSize(point);
            height=point.y;
        }
        

        if (isSupportSmartBar()) {
            int smartBarHeight = getSmartBarHeight(activity);
            
            height -= smartBarHeight;
        }

        if (activity != null && activity.getActionBar() != null) {
            int actionbar= activity.getActionBar().getHeight();
            if(actionbar==0){
                TypedArray actionbarSizeTypedArray=activity.obtainStyledAttributes(new int[]{android.R.attr.actionBarSize});
                actionbar= (int) actionbarSizeTypedArray.getDimension(0,0);
            }
           
            height -= actionbar;
        }

        int status = getStatusBarHeight(activity);
       

        height -= status;

        
        return height;
    }

    private  int getStatusBarHeight(Activity activity) {
        Class<?> c;
        Object obj;
        Field field;
        int x;
        int statusBarHeight = 0;
        try {
            c = Class.forName("com.android.internal.R$dimen");
            obj = c.newInstance();
            field = c.getField("status_bar_height");
            x = Integer.parseInt(field.get(obj).toString());
            statusBarHeight = activity.getResources().getDimensionPixelSize(x);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return statusBarHeight;
    }

    private  int getSmartBarHeight(Activity activity) {
        ActionBar actionbar = activity.getActionBar();
        if (actionbar != null)
            try {
                Class c = Class.forName("com.android.internal.R$dimen");
                Object obj = c.newInstance();
                Field field = c.getField("mz_action_button_min_height");
                int height = Integer.parseInt(field.get(obj).toString());
                return activity.getResources().getDimensionPixelSize(height);
            } catch (Exception e) {
                e.printStackTrace();
                actionbar.getHeight();
            }
        return 0;
    }
    
    
    private boolean isSupportSmartBar() {
        boolean hasSmartBar = false;
        try {
            final Method method = Build.class.getMethod("hasSmartBar");
            if (method != null) {
                hasSmartBar = true;
            }
        } catch (final Exception e) {
            // return false;
        }
        return hasSmartBar;
    }
    
    

    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {

        fl.addView(view);
    }

    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {

    }
}
