package com.example.androidtesteverything._0400控件;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidtesteverything.R;

public class AlertDialogActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        findViewById(R.id.btn_alert).setOnClickListener(this);
        tv_alert = findViewById(R.id.tv_alert);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("尊敬的用户 ");
        builder.setMessage("你真的要卸载我吗？");
        builder.setPositiveButton("残忍卸载", (dialog, which) -> {
            tv_alert.setText("残忍卸载");
        });
        builder.setNegativeButton("我再想想", (dialog, which) -> {
            tv_alert.setText("我再想想");
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}