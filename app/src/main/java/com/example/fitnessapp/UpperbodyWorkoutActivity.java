package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class UpperbodyWorkoutActivity extends AppCompatActivity {

    Button back;
    LinearLayout beginner,min20,athome,advanced,power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upperbody_workout);

        back = (Button) findViewById(R.id.upperbodyworkoutbackbtn);

        beginner = (LinearLayout) findViewById(R.id.upperbody_beginner_workout);
        min20 = (LinearLayout) findViewById(R.id.upperbody_20min_workout);
        athome = (LinearLayout) findViewById(R.id.upperbody_athome_workout);
        advanced = (LinearLayout) findViewById(R.id.upperbody_advanced_workout);
        power = (LinearLayout) findViewById(R.id.upperbody_power_workout);

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
                Intent intent = new Intent(getApplicationContext(), UpperbodyBeginnerWorkoutActivity.class);
                startActivity(intent);
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UpperbodyPowerWorkoutActivity.class);
                startActivity(intent);
            }
        });
        athome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UpperbodyAthomeWorkoutActivity.class);
                startActivity(intent);
            }
        });
        min20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Upperbody20MinWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UpperbodyAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
    }
}