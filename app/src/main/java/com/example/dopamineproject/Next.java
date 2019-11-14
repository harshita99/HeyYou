package com.example.dopamineproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Next extends AppCompatActivity {
    TextView txt;
    String x="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        txt = (TextView)findViewById(R.id.textView1);
        handleIntent();
    }

    private void handleIntent() {

        Intent i = getIntent();
        Integer s = i.getExtras().getInt("Score");
        Log.v("Print Message","Your score is "+s);

        if (s<=9){
            x="None to mild depression." + "\n\n"+
                    "Congratulations! You've answered this quick depression quiz in a manner that suggests that while you may occasionally be experiencing some depressive symptoms from time to time, you're not likely to be suffering a major depressive episode at present. Most people experience depressive feelings from time to time in their lives -- this is normal and expected.";
        }
        else if(s>=10 && s<19){
            x="Mild to moderate"+"\n\n"+
                    " Based upon your responses to this depression quiz, you appear to possibly be suffering from a mild to moderate depressive disorder. You should not take this as a diagnosis of any sort, or a recommendation for treatment. However, you may want to look into seeking further consultation with a trained mental health professional if you are experiencing any difficulties in daily functioning or if you'd like a more in-depth answer.";
        }
        else if(s>=19 && s<=29){
            x="Moderate to severe"+"\n\n"+
                    "Based upon your responses to this quick depression quiz, you appear to possibly be suffering from a moderate to severe depression. People who have answered similarly to you typically qualify for a diagnosis of major depression and have sought professional treatment for this disorder.\n" +
                    "\n" +
                    "You should not take this as a diagnosis of any sort, or a recommendation for treatment. However, if would be advisable and likely beneficial for you to seek further diagnosis from a trained mental health professional soon to rule out a possible depressive disorder.";
        }
        else if(s>=30){
            x="Severe depression"+"\n\n"+"Based upon your responses to this quick depression quiz, you may be suffering from a severe depressive episode. People who have answered similarly to you typically qualify for a diagnosis of major depression and have sought professional treatment for this disorder.\n" +
                    "\n" +
                    "You should not take this as a diagnosis of any sort, or a recommendation for treatment. However, it would be advisable and likely beneficial for you to seek further diagnosis from a trained mental health professional immediately. ";
        }
        txt.setText("Your emotional health score is "+ s.toString()+".\n" + x);
    }

}
