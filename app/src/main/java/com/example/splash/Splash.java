package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;

import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(() -> {
            Intent i = new Intent(Splash.this,MainActivity.class);
            startActivity(i);
            finish();
        },5000);
    }
}