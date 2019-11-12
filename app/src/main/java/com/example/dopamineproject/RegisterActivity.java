package com.example.dopamineproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    private EditText mTextUser;
    private EditText mTextPass;
    private EditText mTextCPass;
    private EditText mTextEmail;
    private EditText Mob1;
    private EditText Mob2;
    private TextView Sign2;
    private DatabaseReference dbReference;
    private FirebaseUser fbuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        progressDialog=new ProgressDialog(this);
        firebaseAuth = FirebaseAuth.getInstance();
        dbReference= FirebaseDatabase.getInstance().getReference("users");
        mTextUser = findViewById(R.id.user);
        mTextPass = findViewById(R.id.pwd);
        mTextCPass = findViewById(R.id.cpwd);
        mTextEmail = findViewById(R.id.email);
        Mob1 = findViewById(R.id.mob1);
        Mob2 = findViewById(R.id.mob2);
        Sign2 = findViewById(R.id.sign2);

        Sign2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mTextEmail.getText().toString().trim();
                String pwd = mTextPass.getText().toString().trim();
                String cpwd = mTextCPass.getText().toString().trim();
                String user = mTextUser.getText().toString().trim();
                String mob1 = Mob1.getText().toString().trim();
                String mob2 = Mob2.getText().toString().trim();
                progressDialog.setMessage("Signing Up...");
                progressDialog.show();
                if(pwd.equals(cpwd)) {
                    register(email, pwd,user,mob1,mob2);
                }
                else {
                    progressDialog.dismiss();
                    Toast.makeText(RegisterActivity.this, "Password Mismatched!!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void register(String e,String p,String u,String m1,String m2){
        final String pass=p,email=e,user=u,mob1=m1,mob2=m2;
        firebaseAuth.createUserWithEmailAndPassword(e,p).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this, "Registered!!", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                    login(email,pass,user,mob1,mob2);
//                    String id = dbReference.push().getKey();
//                    UserInfo users=new UserInfo(id,user,pass,email,mob1,mob2);
//                    dbReference.child(id).setValue(users);

                }
                else {
                    if (pass.length()>=8) {
                        Toast.makeText(RegisterActivity.this, "Something Went Wrong!!", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                    }
                    else {
                        Toast.makeText(RegisterActivity.this, "Password length must be greater than 8 !", Toast.LENGTH_LONG).show();
                        progressDialog.dismiss();
                    }
                }
            }
        });
    }
    public void login(String e,String p,String user,String mob1,String mob2) {
        final String pass = p, email = e, u = user, m1 = mob1, m2 = mob2;
        firebaseAuth.signInWithEmailAndPassword(e, p).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    fbuser = firebaseAuth.getCurrentUser();
                    UseriInfo users = new UseriInfo(fbuser.getUid(), u, pass, email, m1, m2);
                    dbReference.child(fbuser.getUid()).setValue(users);
                    finish();
                    startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                } else {
                    Toast.makeText(RegisterActivity.this, "Something Went Wrong!", Toast.LENGTH_SHORT).show();
                    progressDialog.dismiss();
                }
            }
        });
    }
}
