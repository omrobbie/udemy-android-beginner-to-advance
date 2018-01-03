package com.omrobbie.boundservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myText;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEnv();
    }

    private void setupEnv() {
        myText = (TextView) findViewById(R.id.myText);
        myButton = (Button) findViewById(R.id.myButton);
    }
}
