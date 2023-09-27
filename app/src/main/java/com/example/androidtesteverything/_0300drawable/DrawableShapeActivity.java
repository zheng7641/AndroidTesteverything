package com.example.androidtesteverything._0300drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.androidtesteverything.R;

public class DrawableShapeActivity extends AppCompatActivity implements View.OnClickListener {

    View v_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_shape);
        v_content = findViewById(R.id.v_content);
        findViewById(R.id.btn_rect).setOnClickListener(this);
        findViewById(R.id.btn_oval).setOnClickListener(this);

        v_content.setBackgroundResource(R.drawable.shape_rect_gold);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_rect) {
            v_content.setBackgroundResource(R.drawable.shape_rect_gold);
        } else if(v.getId() == R.id.btn_oval) {
            v_content.setBackgroundResource(R.drawable.shape_oval_rose);
        }
    }
}