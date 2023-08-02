package com.example.androidtesteverything._0200intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.androidtesteverything.R;

public class ActReceiveActivity extends AppCompatActivity {

    TextView tv_receive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_receive);
        tv_receive = findViewById(R.id.tv_receive);
        Bundle bundle = getIntent().getExtras();
        String requestTime = bundle.getString("request_time");
        tv_receive.setText(requestTime);
    }
}