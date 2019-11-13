package com.example.dopamineproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MentalTest extends AppCompatActivity {
    Integer i1=0;
    String s="0";
    int ans;
    SharedPreferences sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental);
        sharedPref = this.getSharedPreferences(
                "com.example.dopamineproject.PREFERENCE_FILE_KEY", Context.MODE_PRIVATE);
    }

    public void goToNextScreen(View view){
        Intent i = new Intent(this,Next.class);
        //SharedPreferences.Editor editor = sharedPref.edit();
        //Save Key and value using editor object
        //editor.putString("NameKey",s);
        //Commit the Changes
        //editor.commit();
        //String previousdata = sharedPref.getString("NameKey","Not Set Yet");
        //if (previousdata=="0")
        //    ans=i1;
        //else
        //    ans=Integer.parseInt(previousdata);

        i.putExtra("Score", i1);
        startActivity(i);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        Context context;
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.r11:
            case R.id.r21:
            case R.id.r31:
            case R.id.r41:
            case R.id.r51:
            case R.id.r61:
            case R.id.r71:
            case R.id.r81:
                if (checked)
                    i1+=1;
                    break;
            case R.id.r12:
            case R.id.r22:
            case R.id.r32:
            case R.id.r42:
            case R.id.r52:
            case R.id.r62:
            case R.id.r72:
            case R.id.r82:
                if (checked)
                    i1+=2;
                    break;
            case R.id.r13:
            case R.id.r23:
            case R.id.r33:
            case R.id.r43:
            case R.id.r53:
            case R.id.r63:
            case R.id.r73:
            case R.id.r83:
                if (checked)
                    i1+=3;
                    break;
            case R.id.r14:
            case R.id.r24:
            case R.id.r34:
            case R.id.r44:
            case R.id.r54:
            case R.id.r64:
            case R.id.r74:
            case R.id.r84:
                if (checked)
                    i1+=4;
                    break;
            case R.id.r15:
            case R.id.r25:
            case R.id.r35:
            case R.id.r45:
            case R.id.r55:
            case R.id.r65:
            case R.id.r75:
            case R.id.r85:
                if (checked)
                    i1+=5;
                    break;


        }
    }
}
