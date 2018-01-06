package com.omrobbie.notifyapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int uniqueID = 40111;

    private NotificationCompat.Builder notificationBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationBuilder = new NotificationCompat.Builder(this);
        notificationBuilder.setAutoCancel(true);
    }

    public void myButtonClick(View view) {
        notificationBuilder.setSmallIcon(R.drawable.firebase);
        notificationBuilder.setTicker("This is a thicker!");
        notificationBuilder.setWhen(System.currentTimeMillis());
        notificationBuilder.setContentTitle("This is the title");
        notificationBuilder.setContentText("Here is the text");

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notificationBuilder.setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(uniqueID, notificationBuilder.build());
    }
}
