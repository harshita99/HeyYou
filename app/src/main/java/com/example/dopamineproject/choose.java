package com.example.dopamineproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class choose extends AppCompatActivity {
    EditText editText ;
    String day ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        Intent i = getIntent() ;
        day = i.getStringExtra("Day");
    }

    public void write(View v){
        Intent i = new Intent(this,writeSomething.class);
        i.putExtra("Day",day);

        startActivity(i);
    }
    public void read(View v){
        Intent i = new Intent(this,readJournal.class);
        i.putExtra("Day",day);
        startActivity(i);
    }

}
