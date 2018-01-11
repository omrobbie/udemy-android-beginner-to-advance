package com.omrobbie.cofeebuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINK_NO = "EXTRA_DRINK_NO ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }
}
