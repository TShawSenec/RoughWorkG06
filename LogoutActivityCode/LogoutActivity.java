package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LogoutActivity extends AppCompatActivity {
    View.OnClickListener LogOut = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("logout", "Logout");
            goToLogin();
        }
    };
    View.OnClickListener backArrowListener = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            Log.d("menu","Back");
            goToMenu();
        }
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        final Button logoutButton = (Button) findViewById(R.id.logout_button);
        logoutButton.setOnClickListener(LogOut);
        final ImageButton backArrowButton = (ImageButton) findViewById(R.id.backbutton);
        backArrowButton.setOnClickListener(backArrowListener);
    }
    public void goToMenu()
    {
        Intent changeActivityIntent  = new Intent(this,MenuActivity.class);
        startActivity(changeActivityIntent);
    }
    public void goToLogin()
    {
        Intent changeActivityIntent  = new Intent(this,LoginActivity.class);
        startActivity(changeActivityIntent);
    }

}
