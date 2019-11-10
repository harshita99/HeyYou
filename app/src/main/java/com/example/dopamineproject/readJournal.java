package com.example.dopamineproject;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class readJournal extends AppCompatActivity {
    TextView txt;
    String day ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readjournal);
        txt = (TextView) findViewById(R.id.readjournal);
        day = getIntent().getStringExtra("Day");

    }
    public void read1(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference().child(day);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.


                Log.i("Value", "Value is: " + dataSnapshot.getValue());
                TextView myAwesomeTextView = (TextView)findViewById(R.id.readjournal);

                //in your OnCreate() method
                myAwesomeTextView.setText(String.valueOf( dataSnapshot.getValue()));

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("no", "Failed to read value.", error.toException());
            }
        });
    }
}
