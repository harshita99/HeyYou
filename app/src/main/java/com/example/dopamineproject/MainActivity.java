package com.example.dopamineproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private Button submit;
    private EditText phno;
    private EditText pass;
    private Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        phno=findViewById(R.id.phno);
        pass=findViewById(R.id.pass);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view==submit){
                    if (verify()){
                        toast("Login Successful.");
                        Intent intent=new Intent(getApplicationContext(), Home_page.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
        sign_up=findViewById(R.id.sign_up);
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view==sign_up){
                    if (phno.getText().toString().isEmpty()){
                        toast("Enter phone number.");
                    }
                    else if(phno.getText().toString().length()!=10 ){
                        toast("Enter a 10 digit number.");
                    }
                    else if(pass.getText().toString().isEmpty() ){
                        toast("Enter password.");
                    }
                    else if(pass.getText().toString().length()<6) {
                        toast("Enter a password containing atleast 6 characters.");
                    }
                    toast("SignUp Successful.");
                    Intent intent=new Intent(getApplicationContext(), Home_page.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }

    private void toast(String m){
        Toast.makeText(getApplicationContext(),m,Toast.LENGTH_SHORT).show();
    }

    private boolean verify(){
        if (phno.getText().toString().isEmpty()){
                toast("Enter phone number.");
                return false;
            }
            else if(phno.getText().toString().length()!=10 ){
                toast("Enter a 10 digit number.");
                return false;
            }
            else if(pass.getText().toString().isEmpty() ){
                toast("Enter password.");
                return false;
            }
            else if(pass.getText().toString().length()<6){
                toast("Enter a password containing atleast 6 characters.");
                return false;
        }
        else if(pass.getText().toString()=="12345678"){
            toast("Incorrect password.");
            return false;
        }
        else {
            return true;
        }
    }


}

