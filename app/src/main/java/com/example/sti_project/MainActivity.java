package com.example.sti_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText email, pass;
    Button login, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = (EditText) findViewById(R.id.Email);
        pass = (EditText) findViewById(R.id.Password);
        login = (Button) findViewById(R.id.Login);
        register = (Button) findViewById(R.id.Register);







    }
}