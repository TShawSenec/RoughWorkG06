package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    View.OnClickListener menuLogoutListener = new View.OnClickListener(){
      @Override
      public void onClick(View v)
      {
          Log.d("menu","LOGOUT");
            goToLogout();
      }
    };

    View.OnClickListener menuViewProfileListener = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            Log.d("menu","Profile");
        }
    };
    View.OnClickListener menuExercisesListener = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            Log.d("menu","Exercise");
        }
    };
    View.OnClickListener menuWorkoutsListener = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            Log.d("menu","Workouts");
        }
    };
    View.OnClickListener menuWorkoutListener = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            Log.d("menu","Start Workout");
        }
    };
    View.OnClickListener menuGoalsListener = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            Log.d("menu","View Goals");
        }
    };
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
     super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final LinearLayout[] linLayButtons = new LinearLayout[6];

        linLayButtons[0] = (LinearLayout) findViewById(R.id.menulogout);
        linLayButtons[1] = (LinearLayout) findViewById(R.id.menuprofile);
        linLayButtons[2] = (LinearLayout) findViewById(R.id.menuExercises);
        linLayButtons[3] = (LinearLayout) findViewById(R.id.menuworkout);
        linLayButtons[4] = (LinearLayout) findViewById(R.id.menustartworkout);
        linLayButtons[5] = (LinearLayout) findViewById(R.id.menugoals);
        linLayButtons[0].setOnClickListener(menuLogoutListener);
        linLayButtons[1].setOnClickListener(menuViewProfileListener);
        linLayButtons[2].setOnClickListener(menuExercisesListener);
        linLayButtons[3].setOnClickListener(menuWorkoutsListener);
        linLayButtons[4].setOnClickListener(menuWorkoutListener);
        linLayButtons[5].setOnClickListener(menuGoalsListener);
    }
    public void goToLogout()
    {
        Intent changeActivityIntent = new Intent(this,LogoutActivity.class);
        startActivity(changeActivityIntent );
    }

}
