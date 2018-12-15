//package com.codepath.insta_droid;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.parse.ParseException;
//import com.parse.ParseUser;
//import com.parse.SignUpCallback;
//
//public class signUp extends AppCompatActivity {
//
//    private Button btnReg;
//    private EditText etEmail;
//    private EditText etPass;
//    private EditText etName;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sign_up);
//
//        etName = findViewById(R.id.etName);
//        etPass = findViewById(R.id.etPass);
//        etEmail = findViewById(R.id.etEmail);
//        btnReg = findViewById(R.id.btnReg);
//
//        btnReg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                //get the username, pass, and email and convert them to string
////                String username = etName.getText().toString();
////                String password = etPass.getText().toString();
////                String email = etEmail.getText().toString();
//
//                // Create the ParseUser
//                ParseUser user = new ParseUser();
//                // Set core properties - store user in parse
//                user.setUsername(etName.getText().toString());
//                //Log.d("Test", username);
//                user.setPassword(etPass.getText().toString());
//                user.setEmail(etEmail.getText().toString());
////              Invoke signUpInBackground - store user in parse
//                user.signUpInBackground(new SignUpCallback() {
//                    @Override
//                    public void done(ParseException e) {
//                        if (e == null) {
//                            // Hooray! Let them use the app now.
//                            Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
////                            final Intent i = new Intent(signUp.this, MainActivity.class);
////                            startActivity(i);
//                            //take user homepage
//                            startActivity(new Intent(signUp.this, MainActivity.class));
//                        } else {
//                            // Sign up didn't succeed. Look at the ParseException
//                            // to figure out what went wrong
//                            Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_SHORT).show();
//                            e.printStackTrace();
//                        }
////                         startActivity(new Intent(signUp.this, MainActivity.class));
//                    }
//                });
//            }
//        });
//    }
//}
