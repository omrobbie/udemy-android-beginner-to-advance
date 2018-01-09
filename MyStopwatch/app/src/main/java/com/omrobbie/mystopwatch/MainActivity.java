package com.omrobbie.mystopwatch;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int seconds = 0;
    private boolean running;

    private TextView timeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeView = (TextView) findViewById(R.id.timeView);

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                runTimer();
                handler.postDelayed(this, 1000);
            }
        });

        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("seconds", seconds);
        outState.putBoolean("running", running);
        super.onSaveInstanceState(outState);
    }

    public void onClickStart(View view) {
        running = true;
    }

    public void onClickStop(View view) {
        running = false;
    }

    public void onClickReset(View view) {
        running = false;
        seconds = 0;
    }

    private void runTimer() {
        Log.i("xxx", "runTimer: " + seconds);
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;

        String time = String.format("%d:%02d:%02d", hours, minutes, secs);
        timeView.setText(time);

        if (running) seconds++;
    }
}
