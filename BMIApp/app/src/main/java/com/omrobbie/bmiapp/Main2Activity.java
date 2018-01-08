package com.omrobbie.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setupEnv();
    }

    public void calcBmi(View view) {
        double weight = 0;
        double height = 0;
        double bmi = 0;
        String msg = "";

        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());

        bmi = height * height;
        bmi = weight / bmi;
        tv1.setText(String.valueOf(bmi));

        if (bmi < 18.5) {
            msg = "Underweight";
        } else if (bmi > 18.5 && bmi < 25) {
            msg = "Normal";
        } else if (bmi > 25) {
            msg = "Overweight";
        }

        tv2.setText(msg);
    }

    private void setupEnv() {
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText1);

        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
    }
}
