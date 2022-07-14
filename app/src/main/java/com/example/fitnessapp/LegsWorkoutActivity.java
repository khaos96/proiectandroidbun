package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LegsWorkoutActivity extends AppCompatActivity {

    Button back;
    LinearLayout beginner,min15,athome,advanced1,advanced2,advanced3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_workout);

        back = (Button) findViewById(R.id.legsworkoutbackbtn);

        beginner = (LinearLayout) findViewById(R.id.legs_beginner_workout);
        min15 = (LinearLayout) findViewById(R.id.legs_15min_workout);
        athome = (LinearLayout) findViewById(R.id.legs_athome_workout);
        advanced1 = (LinearLayout) findViewById(R.id.legs_advanced1_workout);
        advanced2 = (LinearLayout) findViewById(R.id.legs_advanced2_workout);
        advanced3 = (LinearLayout) findViewById(R.id.legs_advanced3_workout);

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
                Intent intent = new Intent(getApplicationContext(), LegsBeginnerWorkoutActivity.class);
                startActivity(intent);
            }
        });
        min15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Legs15MinWorkoutActivity.class);
                startActivity(intent);
            }
        });
        athome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LegsAthomeWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LegsAdvanced1WorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LegsAdvanced2WorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LegsAdvanced3WorkoutActivity.class);
                startActivity(intent);
            }
        });
    }
}