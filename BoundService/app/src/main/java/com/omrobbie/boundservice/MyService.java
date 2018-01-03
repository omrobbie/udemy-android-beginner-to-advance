package com.omrobbie.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyService extends Service {

    private final IBinder myBinder = new MyLocalBinder();

    public class MyLocalBinder extends Binder {
        MyService getService() {
            return MyService.this;
        }
    }

    public MyService() {
    }

    public String getCurrentTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
        return simpleDateFormat.format(new Date());
    }

    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }
}
