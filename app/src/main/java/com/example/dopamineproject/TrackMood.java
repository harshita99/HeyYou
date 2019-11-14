package com.example.dopamineproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TrackMood extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);
        handleIntent();
    }

    private void handleIntent() {
        Intent i = getIntent();
    }

    public void mood(View view) {

        switch (view.getId()) {

            case R.id.crying:
                score = 1;
                break;

            case R.id.sad:
                score = 2;
                break;

            case R.id.neutral:
                score = 3;
                break;

            case R.id.happy:
                score = 4;
                break;

            case R.id.vhappy:
                score = 5;
                break;
        }
        Log.v("Print Message","Hello "+score);
        Toast.makeText(this, "Mood Recorded.", Toast.LENGTH_SHORT).show();
    }
}