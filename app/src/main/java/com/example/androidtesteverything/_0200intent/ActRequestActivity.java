package com.example.androidtesteverything._0200intent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidtesteverything.R;

public class ActRequestActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityResultLauncher<Intent> register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_request);
        TextView tv_request = findViewById(R.id.tv_request);
        tv_request.setText("你睡了吗？");

        findViewById(R.id.btn_request).setOnClickListener(this);

        register = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK) {
                Intent intent = result.getData();
                Bundle bundle = intent.getExtras();
                String responseStr = bundle.getString("response_content");
                TextView tv_response = findViewById(R.id.tv_response);
                tv_response.setText(responseStr);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ActResponseActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("request_content", "你睡了吗？");
        intent.putExtras(bundle);
//        startActivityForResult(intent, 1); 过时
        register.launch(intent);
    }
}