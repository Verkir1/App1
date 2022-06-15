package com.example.try6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate() called");
    }

    protected void onStart() {
        {
            super.onStart();
            Log.i("MainActivity", "onStart() called");
        }
    }
    protected void onResume() {
        {
            super.onResume();
            Log.i("MainActivity","onResume() called");
        }
    }
}