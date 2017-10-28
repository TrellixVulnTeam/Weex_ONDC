package com.wjz.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.weex.commons.AbsWeexActivity;
import com.alibaba.weex.constants.Constants;
import com.google.zxing.integration.android.IntentIntegrator;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXRenderErrorCode;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.utils.WXSoInstallMgrSdk;
import com.wjz.R;

/**
 * Created by wujiazhen on 2017/6/7.
 */

public class WeexActivity2 extends AbsWeexActivity {

    private static final String TAG = "WXPageActivity";
    private ProgressBar mProgressBar;
    private TextView mTipView;

    private boolean mIsShakeDetectorStarted = false;
    private boolean mIsDevSupportEnabled = WXEnvironment.isApkDebugable();
    private String url;
    private String Path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wxpage);
        mContainer = (ViewGroup) findViewById(R.id.container);
        mProgressBar = (ProgressBar) findViewById(R.id.progress);
        mTipView = (TextView) findViewById(R.id.index_tip);


        Uri uri = getIntent().getData();
        Bundle bundle = getIntent().getExtras();

        if (uri != null) {
            mUri = uri;
        }

        if (bundle != null) {
            String bundleUrl = bundle.getString(Constants.PARAM_BUNDLE_URL);
            if (!TextUtils.isEmpty(bundleUrl)) {
                mUri = Uri.parse(bundleUrl);
            }
        }

        if (mUri == null) {
            Toast.makeText(this, "the uri is empty!", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }


        if (!WXSoInstallMgrSdk.isCPUSupport()) {
            mProgressBar.setVisibility(View.INVISIBLE);
            mTipView.setText(R.string.cpu_not_support_tip);
            return;
        }

        url = getUrl(mUri);
        System.out.println("url:     " + url);

        url = "http://172.16.124.142:13456/dist/test.js";

        loadUrl(url);
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    private String getUrl(Uri uri) {
        String url = uri.toString();
        String scheme = uri.getScheme();
        if (uri.isHierarchical()) {
            if (TextUtils.equals(scheme, "http") || TextUtils.equals(scheme, "https")) {
                String weexTpl = uri.getQueryParameter(Constants.WEEX_TPL_KEY);
                if (!TextUtils.isEmpty(weexTpl)) {
                    url = weexTpl;
                }
            }
        }

        System.out.println("------------   " + url);

        return url;
    }

    protected void preRenderPage() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Intent intent = new Intent("requestPermission");
        intent.putExtra("REQUEST_PERMISSION_CODE", requestCode);
        intent.putExtra("permissions", permissions);
        intent.putExtra("grantResults", grantResults);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }


    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {
        mProgressBar.setVisibility(View.GONE);
        mTipView.setVisibility(View.GONE);
    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {
        mProgressBar.setVisibility(View.GONE);
        mTipView.setVisibility(View.VISIBLE);
        if (TextUtils.equals(errCode, WXRenderErrorCode.WX_NETWORK_ERROR)) {
            mTipView.setText(R.string.index_tip);
        } else {
            mTipView.setText("render error:" + errCode);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(isLocalPage() ? R.menu.main_scan : R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_refresh:
                createWeexInstance();
                renderPage();
                break;
            case R.id.action_scan:
                IntentIntegrator integrator = new IntentIntegrator(this);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrator.setPrompt("Scan a barcode");
                //integrator.setCameraId(0);  // Use a specific camera of the device
                integrator.setBeepEnabled(true);
                integrator.setOrientationLocked(false);
                integrator.setBarcodeImageEnabled(true);
                integrator.setPrompt(getString(R.string.capture_qrcode_prompt));
                integrator.initiateScan();
                break;
            case android.R.id.home:
                finish();
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        System.out.println("onActivityResult-------------------");
        System.out.println(requestCode);
        System.out.println(resultCode);
        System.out.println(JSON.toJSONString(data));

        Toast.makeText(this, "此处需要权限处理，尚未适配", Toast.LENGTH_SHORT).show();
        super.onActivityResult(requestCode, resultCode, data);
/*
        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
            Uri uri = data.getData();
            Cursor cursor = getContentResolver().query(uri, null, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {

                Path = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA));
                Log.d("Path", Path);
            }


            try {

                // avoscloud 提供
                final AVFile file = AVFile.withAbsoluteLocalPath("test.png", Path);
                file.saveInBackground(new SaveCallback() {
                    @Override
                    public void done(AVException e) {
                        Log.d(TAG, file.getUrl());
                        WXBridgeManager manager = WXBridgeManager.getInstance();
                        Map<String, String> urlData = new HashMap<String, String>();
                        urlData.put("url", file.getUrl());
                        urlData.put("showimage", "true");
                        urlData.put("uploadhint", "改变图片");
                        urlData.put("showdelete", "true");
                        String jsonStr = JSON.toJSONString(urlData);
                        WXRefreshData refreshData = new WXRefreshData(jsonStr, false);
                        manager.refreshInstance(mInstance.getInstanceId(), refreshData);
                    }
                }, new ProgressCallback() {
                    @Override
                    public void done(Integer integer) {
                        Toast.makeText(getApplicationContext(), "已经上传" + String.valueOf(integer) + "%", Toast.LENGTH_SHORT).show();
                    }
                });
            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "上传图片失败", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(getApplicationContext(), "请选择图片", Toast.LENGTH_SHORT).show();
        }

        */
        /*
        weex 处理 zxing
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);

        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                handleDecodeInternally(result.getContents());
            }
        }
        */

    }

    // Put up our own UI for how to handle the decoded contents.
    private void handleDecodeInternally(String code) {

        if (!TextUtils.isEmpty(code)) {
            Uri uri = Uri.parse(code);
            if (uri.getQueryParameterNames().contains("bundle")) {
                WXEnvironment.sDynamicMode = uri.getBooleanQueryParameter("debug", false);
                WXEnvironment.sDynamicUrl = uri.getQueryParameter("bundle");
                String tip = WXEnvironment.sDynamicMode ? "Has switched to Dynamic Mode" : "Has switched to Normal Mode";
                Toast.makeText(this, tip, Toast.LENGTH_SHORT).show();
                finish();
                return;
            } else if (uri.getQueryParameterNames().contains("_wx_devtool")) {
                WXEnvironment.sRemoteDebugProxyUrl = uri.getQueryParameter("_wx_devtool");
                WXEnvironment.sDebugServerConnectable = true;
                WXSDKEngine.reload();
                Toast.makeText(this, "devtool", Toast.LENGTH_SHORT).show();
                return;
            } else if (code.contains("_wx_debug")) {
                uri = Uri.parse(code);
                String debug_url = uri.getQueryParameter("_wx_debug");
                WXSDKEngine.switchDebugModel(true, debug_url);
                finish();
            } else {
                Toast.makeText(this, code, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Constants.ACTION_OPEN_URL);
                intent.setPackage(getPackageName());
                intent.setData(Uri.parse(code));
                startActivity(intent);
            }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }


}
