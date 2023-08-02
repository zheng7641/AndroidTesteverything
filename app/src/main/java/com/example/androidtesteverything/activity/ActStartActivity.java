package com.example.androidtesteverything.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.androidtesteverything.R;

public class ActStartActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String tag = "ning";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "onCreate");
        setContentView(R.layout.activity_act_start);
        findViewById(R.id.btn_next).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //1、在intent的构造函数中指定
        //Intent intent = new Intent(this, ActFinishActivity.class);
        //2、调用意图对象的setClass方法指定
        Intent intent = new Intent();
//        intent.setClass(this, ActFinishActivity.class);
        //3、调用意图对象的setComponent方法指定
//        ComponentName componentName = new ComponentName(this, ActFinishActivity.class);
//        new ComponentName("", "");//反射，系统应用
//        intent.setComponent(componentName);


        startActivity(new Intent(this, ActFinishActivity.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart");
    }
}