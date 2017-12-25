package com.omrobbie.myoverflowmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        item.setChecked(!item.isChecked());
        switch (item.getItemId()) {
            case R.id.menu_red:
                mainLayout.setBackgroundColor(Color.RED);
                break;

            case R.id.menu_green:
                mainLayout.setBackgroundColor(Color.GREEN);
                break;

            case R.id.menu_blue:
                mainLayout.setBackgroundColor(Color.BLUE);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
