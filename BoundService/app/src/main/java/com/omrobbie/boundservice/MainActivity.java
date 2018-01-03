package com.omrobbie.boundservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myText;
    private Button myButton;

    private MyService myService;
    private boolean isBound = false;

    public void showTime(View view) {
        String currentTime = myService.getCurrentTime();
        myText.setText(currentTime);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEnv();

        Intent intent = new Intent(this, MyService.class);
        bindService(intent,serviceConnection, Context.BIND_AUTO_CREATE);
    }

    private void setupEnv() {
        myText = (TextView) findViewById(R.id.myText);
        myButton = (Button) findViewById(R.id.myButton);
    }

    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyService.MyLocalBinder binder = (MyService.MyLocalBinder) iBinder;
            myService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
}
