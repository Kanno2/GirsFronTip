package com.example.kanno.fategrandtips;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashactivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 3000;  //延迟3秒
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splashactivity.this,RoomList.class);
                startActivity(intent);
            }
        }, SPLASH_DISPLAY_LENGHT);
    }
}
