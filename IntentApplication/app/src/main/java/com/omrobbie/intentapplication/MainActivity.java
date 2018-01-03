package com.omrobbie.intentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        final EditText editText = (EditText) findViewById(R.id.edit_first);
        String userMessage = editText.getText().toString();

        intent.putExtra("firstMessage", userMessage);
        startActivity(intent);
    }
}
