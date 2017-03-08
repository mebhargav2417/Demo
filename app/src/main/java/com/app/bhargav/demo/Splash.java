package com.app.bhargav.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by bhargav on 8/3/17.
 */
public class Splash extends Activity {
    private static int SPLASH_TIME_OUT = 2000;
    protected void onCreate(Bundle savedBundleInstance) {
        super.onCreate(savedBundleInstance);
        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {
        	/*
             * Showing splash screen with a timer.
             */
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
