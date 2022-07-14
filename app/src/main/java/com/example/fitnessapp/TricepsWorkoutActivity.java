package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TricepsWorkoutActivity extends AppCompatActivity {

    Button back;
    LinearLayout beginner,min15,athome,advanced1,advanced2,advanced3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_workout);

        back = (Button) findViewById(R.id.tricepsworkoutbackbtn);

        beginner = (LinearLayout) findViewById(R.id.triceps_beginner_workout);
        min15 = (LinearLayout) findViewById(R.id.triceps_15min_workout);
        athome = (LinearLayout) findViewById(R.id.triceps_athome_workout);
        advanced1 = (LinearLayout) findViewById(R.id.triceps_advanced1_workout);
        advanced2 = (LinearLayout) findViewById(R.id.triceps_advanced2_workout);
        advanced3 = (LinearLayout) findViewById(R.id.triceps_advanced3_workout);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WorkoutsActivity.class);
                startActivity(intent);
            }
        });
        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TricepsBeginnerWorkouttActivity.class);
                startActivity(intent);
            }
        });
        min15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TricepsMinute15WorkoutActivity.class);
                startActivity(intent);
            }
        });
        athome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TricepsAthomeWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TricepsAdvanced1WorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TricepsAdvanced2WorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TricepsAdvanced3WorkoutActivity.class);
                startActivity(intent);
            }
        });
    }
}