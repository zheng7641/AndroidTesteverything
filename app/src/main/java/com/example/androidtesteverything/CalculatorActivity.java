package com.example.androidtesteverything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_result;

    private String firstNum = "";

    private String operator = "";

    private String secondNum = "";

    private String result = "";

    private String showText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tv_result = findViewById(R.id.tv_result);

        findViewById(R.id.btn_cancel).setOnClickListener(this);
        findViewById(R.id.btn_chu).setOnClickListener(this);
        findViewById(R.id.btn_cheng).setOnClickListener(this);
        findViewById(R.id.btn_C).setOnClickListener(this);

        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);
        findViewById(R.id.btn_jia).setOnClickListener(this);

        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_jian).setOnClickListener(this);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_genhao).setOnClickListener(this);

        findViewById(R.id.btn_daoshu).setOnClickListener(this);
        findViewById(R.id.btn_0).setOnClickListener(this);
        findViewById(R.id.btn_dian).setOnClickListener(this);
        findViewById(R.id.btn_dengyu).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String inputText;
        if (v.getId() == R.id.btn_genhao) {
            inputText = "√";
        } else {
            inputText = ((TextView) v).getText().toString();
        }

        if (v.getId() == R.id.btn_cancel) {
            clear();
        } else if (v.getId() == R.id.btn_C) {
        } else if (v.getId() == R.id.btn_jia||v.getId() == R.id.btn_jian||v.getId() == R.id.btn_cheng||v.getId() == R.id.btn_chu) {
            operator = inputText;
            refreshText(showText + operator);
        } else if (v.getId() == R.id.btn_dengyu) {
            double calculateResult = calculateFor();
            refreshOperator(String.valueOf(calculateResult));
            refreshText(showText + "=" + result);
        } else if (v.getId() == R.id.btn_genhao) {
            double genhaoResult =  Math.sqrt(Double.parseDouble(firstNum));
            refreshOperator(String.valueOf(genhaoResult));
            refreshText(showText + "√=" + result);
        } else if (v.getId() == R.id.btn_daoshu) {
            double daoshuResult = 1 / Double.parseDouble(firstNum);
            refreshOperator(String.valueOf(daoshuResult));
            refreshText(showText + "/=" + result);
        } else {
            if(result.length()>0 && operator.equals("")) {
                clear();
            }

            //数字
            if (operator.equals("")) {
                firstNum += inputText;
            } else {
                secondNum += inputText;
            }
            if(showText.equals("0") && !inputText.equals(".")){
                refreshText(inputText);
            }else {
                refreshText(showText + inputText);
            }
        }
    }

    private double calculateFor() {
        if ("+".equals(operator)) {
            return Double.parseDouble(firstNum) + Double.parseDouble(secondNum);

        } else if ("-".equals(operator)) {
            return Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
        } else if ("*".equals(operator)) {
            return Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
        } else if ("/".equals(operator)) {
            return Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
        }
        return 0;
    }

    private void clear() {
        refreshText("");
    }

    private  void refreshOperator(String newResullt){
        result = newResullt;
        firstNum = result;
        secondNum = "";
        operator = "";
    }

    private void refreshText(String text){
        showText = text;
        tv_result.setText(showText);
    }
}