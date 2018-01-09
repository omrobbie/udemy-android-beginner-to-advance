package com.omrobbie.mycheckboxapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);

        boolean check = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.tea:
                textView.setText("Tea");
                break;

            case R.id.milk:
                textView.setText("Milk");
                break;
        }
    }
}
