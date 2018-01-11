package com.omrobbie.cofeebuzz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        break;

                    case 2:
                        break;
                }
            }
        };

        ListView listView = (ListView) findViewById(R.id.list_option);
        listView.setOnItemClickListener(itemClickListener);
    }
}
