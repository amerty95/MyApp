package com.example.zorlu.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zorlu.mylibrary.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(Test.getString());
    }
}
