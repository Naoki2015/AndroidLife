package com.camnter.newlife.views.activity.util;

import android.os.Bundle;
import android.widget.TextView;

import com.camnter.newlife.R;
import com.camnter.newlife.core.BaseAppCompatActivity;
import com.camnter.newlife.utils.DeviceUtils;


/**
 * Description：DeviceUtilActivity
 * Created by：CaMnter
 * Time：2015-10-13 17:48
 */
public class DeviceUtilActivity extends BaseAppCompatActivity {

    private TextView deviceIdTV;
    private TextView versionCodeTV;
    private TextView versionNameTV;

    private TextView phoneBrandTV;
    private TextView phoneModelTV;
    private TextView apiLevelTV;
    private TextView apiVersionTV;

    private TextView appProcessIdTV;
    private TextView appNameTV;

    private TextView metaDataTV;

    /**
     * Fill in layout id
     *
     * @return layout id
     */
    @Override
    protected int getLayoutId() {
        return R.layout.device_util;
    }

    /**
     * Initialize the view in the layout
     *
     * @param savedInstanceState savedInstanceState
     */
    @Override
    protected void initViews(Bundle savedInstanceState) {
        this.deviceIdTV = (TextView) this.findViewById(R.id.device_id_tv);
        this.versionCodeTV = (TextView) this.findViewById(R.id.version_code_tv);
        this.versionNameTV = (TextView) this.findViewById(R.id.version_name_tv);

        this.phoneBrandTV = (TextView) this.findViewById(R.id.phone_brand_tv);
        this.phoneModelTV = (TextView) this.findViewById(R.id.phone_model_tv);
        this.apiLevelTV = (TextView) this.findViewById(R.id.phone_api_level_tv);
        this.apiVersionTV = (TextView) this.findViewById(R.id.phone_api_version_tv);

        this.appProcessIdTV = (TextView) this.findViewById(R.id.app_process_id_tv);
        this.appNameTV = (TextView) this.findViewById(R.id.app_name_tv);

        this.metaDataTV = (TextView) this.findViewById(R.id.meta_data_tv);


    }

    /**
     * Initialize the View of the listener
     */
    @Override
    protected void initListeners() {

    }

    /**
     * Initialize the Activity data
     */
    @Override
    protected void initData() {
        this.deviceIdTV.setText(DeviceUtils.getDeviceId(this));
        this.versionCodeTV.setText(DeviceUtils.getVersionCode(this));
        this.versionNameTV.setText(DeviceUtils.getVersionName(this));

        this.phoneBrandTV.setText(DeviceUtils.getPhoneBrand());
        this.phoneModelTV.setText(DeviceUtils.getPhoneModel());
        this.apiLevelTV.setText(DeviceUtils.getBuildLevel() + "");
        this.apiVersionTV.setText(DeviceUtils.getBuildVersion());
        this.appProcessIdTV.setText(DeviceUtils.getAppProcessId() + "");
        this.appNameTV.setText(DeviceUtils.getAppProcessName(this, DeviceUtils.getAppProcessId()));
        this.metaDataTV.setText(DeviceUtils.getMetaData(this, "DEBUG"));
    }
}
