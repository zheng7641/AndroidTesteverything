package com.example.androidtesteverything;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class activity_button_long_click extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_long_click);
        Button button = findViewById(R.id.btn_long_click);
        TextView textView = findViewById(R.id.tv_long_click_result);
        button.setOnLongClickListener(v -> {
            SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
            textView.setText(df.format(new Date()));
            return true;
        });

    }
}