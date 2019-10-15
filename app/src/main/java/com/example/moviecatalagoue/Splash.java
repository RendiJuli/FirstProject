package com.example.moviecatalagoue;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Splash extends AppCompatActivity {

    //kenalin
    private int time_loading=4000;
    //4000 4detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke Main activity
                Intent home= new Intent(Splash.this,MainActivity.class); //Akan Berpindah Ke Halaman Utama Aplikasi (Main_Activity)
                startActivity(home); //Awal Memulai
                finish();

            }
        },time_loading);
    }
}
