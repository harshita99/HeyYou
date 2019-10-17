package com.example.dopamineproject;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        Context context;
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.r1:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                            "radio one checked!",
                            Toast.LENGTH_SHORT).show();
                    break;
            case R.id.r2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.r3:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.r4:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.r5:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}
