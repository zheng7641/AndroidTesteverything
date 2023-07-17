package com.example.androidtesteverything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class activity_image_scale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_scale);

        ImageView iv = findViewById(R.id.image_iv);

//        iv.setImageResource(R.drawable.echarts);
        iv.setScaleType(ImageView.ScaleType.CENTER);
    }
}