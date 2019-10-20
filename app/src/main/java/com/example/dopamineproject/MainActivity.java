package com.example.dopamineproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trackmood(View view ){

    }

    public void drawingpad(View view ){
        Intent k = new Intent(this,MainDraw.class);
        //i.putExtra("Message", "Yo yo");
        startActivity(k);

    }
    public void mentaltest(View view ){
        Intent j = new Intent(this,MentalTest.class);
        //i.putExtra("Message", "Yoyo");
        startActivity(j);
    }

    public void journal(View view ){

    }


}
