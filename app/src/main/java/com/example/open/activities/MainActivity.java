package com.example.open.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//1. Create Activity for Splash Screen.
//2. Change Manifest File(Add android:theme="@style/Theme.AppCompat.NoActionBar"
//3. Edit Splash Screen java file.
