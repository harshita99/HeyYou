package com.example.dopamineproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class MentalTest extends AppCompatActivity {
    Integer i1=0;
    String s="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental);
    }

    public void goToNextScreen(View view){
        Intent i = new Intent(this,Next.class);
        i.putExtra("Score", i1);
        startActivity(i);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        Context context;
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.r1:
                if (checked)
                    i1+=1;
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
            case R.id.rr1:
                if (checked)
                    i1+=1;
                break;
            case R.id.rr2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rr3:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rr4:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rr5:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rrr1:
                if (checked)
                    i1+=1;
                break;
            case R.id.rrr2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rrr3:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rrr4:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.rrr5:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
}
