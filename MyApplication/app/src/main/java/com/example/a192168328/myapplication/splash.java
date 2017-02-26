package com.example.a192168328.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){
            @Override
            public void run() {
                try{
                    Log.e("Launching try", "Launched");
                    sleep(3000);
                }
                catch (Exception e){
                    Log.e("Launching Exception", "Launched");
                    e.printStackTrace();
                }
                finally
                {
                    Log.e("Launching Intent", "Launched");
                    Intent i = new Intent(splash.this, signup.class);
                    startActivity(i);
                }
            }
        };

        timer.start();


    }
}
