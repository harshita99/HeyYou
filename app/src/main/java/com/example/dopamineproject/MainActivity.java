package com.example.dopamineproject;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


}
