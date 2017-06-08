package com.wjz;


import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class SplashActivity extends FragmentActivity {

    private static final long SPLASH_DELAY_MILSS = 1500;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        et = (EditText) findViewById(R.id.et);

        et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                switch (actionId) {
                    case EditorInfo.IME_ACTION_SEND:

                        test();
                        break;

                }

                return true;
            }
        });

        SharedPreferences sp = getSharedPreferences("userinfo", MODE_PRIVATE);

        final String username = sp.getString("username", "");
        final String un = "123";


        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                test();
            }
        });


        dispatch(username, un);
    }

    private void test() {

        String s = et.getText().toString().trim();
        String url = Conf.URL + s + ".js";

        if (!TextUtils.isEmpty(url)) {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String scheme = Uri.parse(url).getScheme();
            StringBuilder builder = new StringBuilder();
            if (TextUtils.equals("file", scheme)) {
                intent.putExtra("isLocal", true);
            } else if (!TextUtils.equals("http", scheme) && !TextUtils.equals("https", scheme)) {
                builder.append("http:");
            }
            builder.append(url);

            Uri uri = Uri.parse(builder.toString());
            intent.setData(uri);
            intent.addCategory("com.taobao.android.intent.category.WEEX");
            intent.setPackage(getPackageName());
            startActivity(intent);
        }
    }

    private void dispatch(String username, String un) {
        if (!username.equals(un)) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    //go(Conf.URL + "login.js");

                }
            }, SPLASH_DELAY_MILSS);
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    go(Conf.URL + "index.js");
                }
            }, SPLASH_DELAY_MILSS);
        }
    }

    private void go(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse(url);
        intent.setData(uri);
        intent.addCategory("com.taobao.android.intent.category.WEEX");
        intent.setPackage(getPackageName());
        startActivity(intent);
        this.finish();
    }


}
