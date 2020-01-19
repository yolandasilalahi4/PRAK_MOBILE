package com.example.hm_ittp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(2000); // set Waktu Pending selama 2 detik
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                    startActivity(new Intent(splash.this, MainActivity.class));
                    finish(); // Menutup Activity
                }
            }
        };
        thread.start();
    }
}