package com.example.androidtesteverything;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ButtonEnableActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_test;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_enable);

        Button btn_enable = findViewById(R.id.enable);
        Button btn_disable = findViewById(R.id.disable);
         btn_test = findViewById(R.id.btn_test);
        tv = findViewById(R.id.tv_result);

        btn_enable.setOnClickListener(this);
        btn_disable.setOnClickListener(this);
        btn_test.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.enable) {
            btn_test.setEnabled(true);
            btn_test.setTextColor(Color.BLACK);
        } else if (id == R.id.disable) {
            btn_test.setEnabled(false);
            btn_test.setTextColor(Color.GRAY);
        } else if (id == R.id.btn_test) {
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
            tv.setText(df.format(new Date()));
        }
    }
}