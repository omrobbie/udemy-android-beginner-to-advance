package com.omrobbie.intentapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle firstData = getIntent().getExtras();
        if (firstData == null) return;

        String firstMessage = firstData.getString("firstMessage");

        TextView textView = (TextView) findViewById(R.id.text_data);
        textView.setText(firstMessage);
    }

    public void onClick(View view) {
        finish();
    }
}
