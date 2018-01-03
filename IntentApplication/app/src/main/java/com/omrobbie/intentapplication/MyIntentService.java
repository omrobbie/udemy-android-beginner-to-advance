package com.omrobbie.intentapplication;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by omrobbie on 04/01/2018.
 */

public class MyIntentService extends IntentService {

    private static final String TAG = MyIntentService.class.getSimpleName();

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "onHandleIntent: The service has been started!");
    }
}
