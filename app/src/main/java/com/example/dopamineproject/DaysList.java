package com.example.dopamineproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DaysList extends AppCompatActivity {

    //String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    ListView listView ;
    ArrayList<String> days ;
    ArrayAdapter<String> arrayAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_list);

        days = new ArrayList<>();

        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        listView = findViewById(R.id.listView);

        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,days);

        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),choose.class);
                i.putExtra("Day",days.get(position));
                Log.i("Position",String.valueOf(position));
                Log.i("Day",days.get(position));
                startActivity(i);
            }
        });

    }

  /*  public void rohit(){

        String s = editTExt.getText();
        days.add
    }*/
}