package com.wjz.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.wjz.Conf;
import com.wjz.R;

/**
 * Created by wujiazhen on 2017/6/8.
 */

public class HomeActivity extends FragmentActivity implements View.OnClickListener {

    private ImageView qiubai;
    private ImageView baozou;
    private ImageView neihan;
    private ImageView pengfu;
    private ImageView mahua;
    private ImageView baisi;
    private ImageView laifu;
    private ImageView xiaohua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        qiubai = (ImageView)findViewById(R.id.qiubai);
        qiubai.setOnClickListener(this);

        baozou = (ImageView)findViewById(R.id.baozou);
        baozou.setOnClickListener(this);

        neihan = (ImageView)findViewById(R.id.neihan);
        neihan.setOnClickListener(this);

        pengfu = (ImageView)findViewById(R.id.pengfu);
        pengfu.setOnClickListener(this);

        mahua = (ImageView)findViewById(R.id.kuailemahua);
        mahua.setOnClickListener(this);

        baisi = (ImageView)findViewById(R.id.baisijie);
        baisi.setOnClickListener(this);

        laifu = (ImageView)findViewById(R.id.laifudao);
        laifu.setOnClickListener(this);

        xiaohua = (ImageView)findViewById(R.id.xiaohua);
        xiaohua.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        String _url = "";
        switch (v.getId()){
            case R.id.baozou:

                _url="joke/baozou.js";

                break;
            case R.id.laifudao:

                _url="joke/laifu.js";

                break;
            case R.id.baisijie:

                _url="joke/baisi.js";

                break;
            case R.id.neihan:

                _url="joke/neihan.js";

                break;
            case R.id.pengfu:
                _url="joke/pengfu.js";

                break;
            case R.id.kuailemahua:
                _url="joke/mahua.js";

                break;
            case R.id.qiubai:
                _url="joke/qiushibaike.js";

                break;
            case R.id.xiaohua:
                _url="index.js";

            default:
                break;
        }

        dispach(Conf.URL+_url);
    }

    private void dispach(String url){
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
}
