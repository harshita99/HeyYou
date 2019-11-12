package com.example.dopamineproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Quote extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        textView = findViewById(R.id.quote);

        Toast.makeText(getApplicationContext(),"Here's a quote for you",Toast.LENGTH_SHORT).show();
        textView.setText("Happiness goes hand-in-hand with laughing and humor is a great stress reliever");
    }
}
