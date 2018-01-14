package com.omrobbie.abcbuilder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEnv();
    }

    public void ButtonClick(View view) {
        String oEmail = "admin";
        String oPass = "admin";

        if (email.equals(oEmail) && password.equals(oPass)) {

        } else {
            Toast.makeText(this, "Invalid email or password!", Toast.LENGTH_SHORT).show();
        }
    }

    private void setupEnv() {
        email = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
    }
}
