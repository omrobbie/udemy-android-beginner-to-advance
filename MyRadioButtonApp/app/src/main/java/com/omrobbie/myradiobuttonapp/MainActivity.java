package com.omrobbie.myradiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClicked(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int id = radioGroup.getCheckedRadioButtonId();

        switch (id) {
            case R.id.male:
                textView.setText("Male");
                break;

            case R.id.female:
                textView.setText("Female");
                break;
        }
    }
}
