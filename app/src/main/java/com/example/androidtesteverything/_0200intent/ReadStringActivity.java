package com.example.androidtesteverything._0200intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androidtesteverything.R;

public class ReadStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_string);
        TextView textView = findViewById(R.id.tv_resource);
        //从string.xml中读取字符串
        String string = getString(R.string.test2);
        textView.setText(string);


        PackageManager packageManager = getPackageManager();
        try {
            //获取当前应用的版本号
            ActivityInfo activityInfo = packageManager.getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Bundle metaData = activityInfo.metaData;
            String versionName = metaData.getString("versionName");
            textView.setText(versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}