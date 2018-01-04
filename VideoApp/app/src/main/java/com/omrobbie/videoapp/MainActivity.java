package com.omrobbie.videoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView myVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEnv();

        myVideoView.setVideoPath("http://www.ebookfrenzy.com/android_book/movie.mp4");
        myVideoView.start();
    }

    private void setupEnv() {
        myVideoView = (VideoView) findViewById(R.id.myVideoView);
    }
}
