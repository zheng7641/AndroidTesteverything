package com.example.androidtesteverything._0200intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidtesteverything.R;

public class ActSendActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_send);
        tv_send = findViewById(R.id.tv_send);
        findViewById(R.id.btn_send).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ActReceiveActivity.class);
        //创建一个包裹
        Bundle bundle = new Bundle();
        bundle.putString("request_time", "2020-01-01 00:00:00");
        intent.putExtras(bundle);
        startActivity(intent);
    }
}