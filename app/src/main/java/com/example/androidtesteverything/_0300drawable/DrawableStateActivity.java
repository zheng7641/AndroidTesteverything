package com.example.androidtesteverything._0300drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidtesteverything.R;

public class DrawableStateActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_state);
        findViewById(R.id.btn_selector).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}