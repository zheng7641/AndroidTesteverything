package com.example.androidtesteverything._0400控件;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.androidtesteverything.R;

import java.util.Calendar;

public class DatePickerActivity extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    DatePicker dp_date;
    TextView tv_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        findViewById(R.id.btn_ok).setOnClickListener(this);
        findViewById(R.id.btn_date).setOnClickListener(this);
        dp_date = findViewById(R.id.dp_date);
        tv_date = findViewById(R.id.tv_date);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_ok) {
            int year = dp_date.getYear();
            int month = dp_date.getMonth();
            int dayOfMonth = dp_date.getDayOfMonth();
            String s = "您选择的是:" + year + "年" + (month+1) + "月" + dayOfMonth + "日";
            tv_date.setText(s);
        } else if (v.getId() == R.id.btn_date) {
//            Calendar calendar = Calendar.getInstance();
//            int year = calendar.get(Calendar.YEAR);
//            int month = calendar.get(Calendar.MONTH);
//            int dayOfMonth1 = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(this,this,2090,5,11);
            dialog.show();
        }
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String s = "您选择的是:" + year + "年" + (month+1) + "月" + dayOfMonth + "日";
        tv_date.setText(s);
    }
}