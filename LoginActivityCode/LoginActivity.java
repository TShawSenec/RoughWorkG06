package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private View.OnClickListener loginListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            login();
        }
    };
    private View.OnClickListener signUpListener = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            signUp();
        }
    };

    private EditText UserName;
    private EditText Password;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Button loginButton = (Button) findViewById(R.id.login_button);
        final Button signUpButton = (Button) findViewById(R.id.signup_button);

        UserName = (EditText) findViewById(R.id.user_text);
        Password = (EditText) findViewById(R.id.passtext);
        loginButton.setOnClickListener(loginListener);
        signUpButton.setOnClickListener(signUpListener);
    }
    public String getUserName()
    {
        return UserName.getText().toString();
    }
    public String getPassword()
    {
        return Password.getText().toString();
    }
    public void login()
    {
        //Verify the credentials
        Log.d("login","pass"+getPassword());
        if(getUserName().equals("TestCred") && getPassword().equals("12345678"))
        {
            Intent changeActivityIntent  = new Intent(this,MenuActivity.class);
            startActivity(changeActivityIntent );
        }
    }
    public void signUp()
    {
        //Redirect to sign up page
    }
}
