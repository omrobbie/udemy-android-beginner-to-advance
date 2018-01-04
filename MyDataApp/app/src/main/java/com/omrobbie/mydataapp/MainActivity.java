package com.omrobbie.mydataapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText myInput;
    private TextView myText;

    private MyDbHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHandler = new MyDbHandler(this);

        setupEnv();
        printDatabase();
    }

    public void addButtonClick(View view) {
        Products products = new Products(myInput.getText().toString());
        dbHandler.addProduct(products);
        printDatabase();
    }

    public void deleteButtonClick(View view) {
        dbHandler.deleteProduct(myInput.getText().toString());
        printDatabase();
    }

    private void setupEnv() {
        myInput = (EditText) findViewById(R.id.myInput);
        myText = (TextView) findViewById(R.id.myText);
    }

    private void printDatabase() {
        String dbString = dbHandler.databaseToString();
        Log.i("xxx", "printDatabase: " + dbString);
        myText.setText(dbString);
    }
}
