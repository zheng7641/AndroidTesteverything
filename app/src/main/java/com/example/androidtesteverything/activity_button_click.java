package com.example.androidtesteverything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class activity_button_click extends AppCompatActivity implements View.OnClickListener{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);
        Button button = findViewById(R.id.btn_click_single);
        textView = findViewById(R.id.tv_result);
        button.setOnClickListener(new MyOnClickListener(textView));

        Button button1 = findViewById(R.id.btn_click_public);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_click_public) {
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
            textView.setText(df.format(new Date()));
        }
    }

    static class MyOnClickListener implements View.OnClickListener{

        private final TextView textView;

        public MyOnClickListener(TextView textView) {
            this.textView = textView;
        }

        @Override
        public void onClick(View v) {
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
            textView.setText(df.format(new Date()));
        }
    }
}