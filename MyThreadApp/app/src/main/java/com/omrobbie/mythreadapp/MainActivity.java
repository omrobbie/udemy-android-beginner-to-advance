package com.omrobbie.mythreadapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myText;
    private Button myButton;

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            myText.setText("Button Clicked!");
        }
    };

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

    public void clickMyButton(View view) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                long futureTime = System.currentTimeMillis() + 10000;

                while (System.currentTimeMillis() < futureTime) {
                    synchronized (this) {
                        try {
                            wait(futureTime - System.currentTimeMillis());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

                handler.sendEmptyMessage(0);
            }
        };

        new Thread(runnable).start();
    }
}
