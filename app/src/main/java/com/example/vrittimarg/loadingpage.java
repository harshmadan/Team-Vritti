package com.example.vrittimarg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class loadingpage extends AppCompatActivity {

    private static final long SPLASH_DISPLAY_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingpage);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Navigate to the main activity or another screen after the splash screen
                Intent intent = new Intent(loadingpage.this, loginpage.class);
                startActivity(intent);
                finish(); // Close the splash screen activity
            }
        }, SPLASH_DISPLAY_DURATION);
    }
}