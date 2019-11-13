package com.example.dopamineproject;
import static android.Manifest.permission.CALL_PHONE;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.view.View;
import android.widget.TextView;

public class Helpline extends AppCompatActivity {
    private Button button;
    private TextView number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
        button = (Button) findViewById(R.id.call_button);
        number = (TextView) findViewById(R.id.phone_number);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String phone_number = number.getText().toString();
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:" + phone_number));
                    if (ContextCompat.checkSelfPermission(getApplicationContext(),
                            CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                        startActivity(callIntent);
                    } else {
                        requestPermissions(new String[]{CALL_PHONE}, 1);
                    }

                }
            });
    }
    public void web_View_Link(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vandrevalafoundation.com/"));
        startActivity(i);
    }

}
