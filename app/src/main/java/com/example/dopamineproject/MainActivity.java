package com.example.dopamineproject;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private PendingIntent pendingIntent1,pendingIntent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.HOUR_OF_DAY, 11);
        calendar1.set(Calendar.MINUTE, 39);
        calendar1.set(Calendar.SECOND, 0);
        calendar1.set(Calendar.AM_PM,Calendar.PM);
        Intent myIntent1 = new Intent(MainActivity.this, receiver1.class);
        pendingIntent1 = PendingIntent.getBroadcast(MainActivity.this, 0, myIntent1, 0);
        AlarmManager alarmManager1 = (AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager1.set(AlarmManager.RTC, calendar1.getTimeInMillis(), pendingIntent1);

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.HOUR_OF_DAY, 11);
        calendar2.set(Calendar.MINUTE, 39);
        calendar2.set(Calendar.SECOND, 0);
        calendar2.set(Calendar.AM_PM,Calendar.PM);
        Intent myIntent2 = new Intent(MainActivity.this, Receiver2.class);
        pendingIntent2 = PendingIntent.getBroadcast(MainActivity.this, 1, myIntent2, 0);

        AlarmManager alarmManager2 = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager2.set(AlarmManager.RTC, calendar2.getTimeInMillis(), pendingIntent2);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.song);
        final ImageView music = findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!mp.isPlaying()) {
                    mp.start();
                    mp.setLooping(true);
                    music.setImageResource(android.R.drawable.ic_lock_silent_mode);
                }

                else {
                    music.setImageResource(android.R.drawable.ic_lock_silent_mode_off);
                    mp.pause();
                }
            }
        });
    }

    public void trackmood(View view ){

    }

    public void drawingpad(View view ){
        Intent k = new Intent(this,MainDraw.class);
        startActivity(k);

    }
    public void mentaltest(View view ){
        Intent j = new Intent(this,MentalTest.class);
        startActivity(j);
    }

    public void journal(View view ){

    }
    public void next(View v){
        Intent i = new Intent(this,DaysList.class);

        startActivity(i);
    }


}
