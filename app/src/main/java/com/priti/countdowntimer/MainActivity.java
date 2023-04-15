package com.priti.countdowntimer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer n1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView number = findViewById(R.id.mnumber);
        final TextView Done = findViewById(R.id.Done);
        n1 = MediaPlayer.create(MainActivity.this,R.raw.two);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisecondUnitDone) {
                number.setText("Time:" +String.valueOf(millisecondUnitDone/1000));

            }

            @Override
            public void onFinish() {
                Done.setText("Done!!");
                n1.start();

            }
        }.start();
    }


}