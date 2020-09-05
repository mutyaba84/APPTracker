package com.example.apptracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.apptracker.Registration.Login;

/**
 * Created by Inamul on 9/7/2017.
 */

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);




        Thread timerthread = new Thread(){
            public  void run(){
                try{
                    sleep(3000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(Splash.this, Login.class);
                    startActivity(intent);
                }
            }
        };
        timerthread.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
