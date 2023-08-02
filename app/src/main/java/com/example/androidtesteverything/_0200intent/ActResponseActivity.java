package com.example.androidtesteverything._0200intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidtesteverything.R;

public class ActResponseActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_response);
        TextView tv_request = findViewById(R.id.tv_request);
        //从上一个页面传来的意图中获取数据
        Bundle bundle = getIntent().getExtras();
        String requestStr = bundle.getString("request_content");
        tv_request.setText(requestStr);

        findViewById(R.id.btn_request1).setOnClickListener(this);

        TextView tv_response = findViewById(R.id.tv_response);
        tv_response.setText("我还没睡");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        //返回数据给上一个页面
        Bundle bundle = new Bundle();
        bundle.putString("response_content", "我还没睡");
        intent.putExtras(bundle);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}