package com.example.androidtesteverything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class activity_button_style extends AppCompatActivity {

    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_style);
        tv_result  = findViewById(R.id.tv_result);
    }

    public void doClick(View view) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        tv_result.setText(df.format(new Date()));
    }
}