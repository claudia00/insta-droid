package com.codepath.insta_droid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    //private static final String TAG1 = "SignUp";

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
   // private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        //btnSignup = findViewById(R.id.btnSignup);
        btnLogin = findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                login(username, password);
            }
        });
    }

        private void login (String username,final String password){
            ParseUser.logInInBackground(username, password, new LogInCallback() {
                @Override
                public void done(ParseUser user, ParseException e) {
                    if(user != null) {
                        Log.e(TAG, "Issue with login");
                        e.printStackTrace();
                        return;

                    }else {
                        Intent i = new Intent (LoginActivity.this, MainActivity.class);
                        startActivity(i);
                        finish();

                    }

//                    //TODO: navigate to new activity if the user has signed in properly
//                    if (e == null) {
//                        final Intent i = new Intent(LoginActivity.this, MainActivity.class);
//                        startActivity(i);
//                        finish();
//
//                    }else{
//                    Log.e(TAG, "issue!");
//                    e.printStackTrace();
//                    //return;}
            }
                    });
        }
}



        //public void goMainActivity(){


