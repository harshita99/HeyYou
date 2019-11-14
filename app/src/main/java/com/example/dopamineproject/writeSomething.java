package com.example.dopamineproject;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class writeSomething extends AppCompatActivity {
    EditText txt ;
    String day ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writesomething);
        txt = (EditText)findViewById(R.id.journal);

        day = getIntent().getStringExtra("Day");

    }
    public void submit(View view){

        String s = txt.getText().toString();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference().child(day);
        Toast.makeText(this,"Entry Submitted.",Toast.LENGTH_SHORT).show();
        ref.setValue(s);
    }
}
