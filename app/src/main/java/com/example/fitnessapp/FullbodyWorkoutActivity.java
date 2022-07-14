package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class FullbodyWorkoutActivity extends AppCompatActivity {

    Button back;
    LinearLayout beginner,min20,athome,advanced,power;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullbody_workout);

        back = (Button) findViewById(R.id.fullbodyworkoutbackbtn);

        beginner = (LinearLayout) findViewById(R.id.fullbody_beginner_workout);
        min20 = (LinearLayout) findViewById(R.id.fullbody_20min_workout);
        athome = (LinearLayout) findViewById(R.id.fullbody_athome_workout);
        advanced = (LinearLayout) findViewById(R.id.fullbody_advanced_workout);
        power = (LinearLayout) findViewById(R.id.fullbody_power_workout);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WorkoutsActivity.class);
                startActivity(intent);
            }
        });
        min20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FullbodyBeginnerWorkoutActivity.class);
                startActivity(intent);
            }
        });
        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FullbodyMin20WorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FullbodyAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
        athome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FullbodyAthomeWorkoutActivity.class);
                startActivity(intent);
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FullbodyPowerWorkoutActivity.class);
                startActivity(intent);
            }
        });
    }
}