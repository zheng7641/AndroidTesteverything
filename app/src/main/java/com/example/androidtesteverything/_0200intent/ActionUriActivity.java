package com.example.androidtesteverything._0200intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.androidtesteverything.R;

public class ActionUriActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_uri);
        findViewById(R.id.btn_dial).setOnClickListener(this);
        findViewById(R.id.btn_sms).setOnClickListener(this);
        findViewById(R.id.btn_my).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String phoneNo = "10086";
        int id = v.getId();
        Intent intent = new Intent();
        if (id == R.id.btn_dial) {
            //设置意图的动作
            intent.setAction(Intent.ACTION_DIAL);
            Uri uri = Uri.parse("tel:" + phoneNo);
            intent.setData(uri);
            startActivity(intent);
        } else if (id == R.id.btn_sms) {
            //设置意图的动作
            intent.setAction(Intent.ACTION_SENDTO);
            Uri uri = Uri.parse("smsto:" + phoneNo);
            intent.setData(uri);
            startActivity(intent);
        } else if (id == R.id.btn_my) {
            //设置意图的动作
            intent.setAction("android.intent.action.NING");
            intent.addCategory(Intent.CATEGORY_DEFAULT);
            startActivity(intent);
        }
    }
}