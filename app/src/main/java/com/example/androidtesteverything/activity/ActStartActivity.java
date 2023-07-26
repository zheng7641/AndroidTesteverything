package com.example.androidtesteverything.activity;

import androidx.appcompat.app.AppCompatActivity;

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