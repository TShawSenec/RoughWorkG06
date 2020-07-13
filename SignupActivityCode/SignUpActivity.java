package com.example.fitnessapp;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;



public class SignUpActivity extends AppCompatActivity {
    private View.OnClickListener backButtonListen = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            returnToLogin();
        }

    };
    private View.OnClickListener agreeButtonListen = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {

        }

    };
    private View.OnClickListener signUpButtonListen= new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            returnToLogin();
        }

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final Button signupButton = (Button) findViewById(R.id.signup_button);
        final RadioButton agreementButton = (RadioButton) findViewById(R.id.terms_services_radio);
        final ImageButton backArrow = (ImageButton) findViewById(R.id.backbutton);
        backArrow.setOnClickListener(backButtonListen);
        signupButton.setOnClickListener(signUpButtonListen);
        agreementButton.setOnClickListener(agreeButtonListen);

    }
    public void returnToLogin()
    {
        Intent changeActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(changeActivityIntent);
    }
}
