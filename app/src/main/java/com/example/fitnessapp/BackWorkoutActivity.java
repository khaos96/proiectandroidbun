package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class BackWorkoutActivity extends AppCompatActivity {

    Button back;
    LinearLayout beginner,min15,athome,advanced1,advanced2,advanced3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_workout);

        beginner = (LinearLayout) findViewById(R.id.back_beginner_workout);
        min15 = (LinearLayout) findViewById(R.id.back_15min_workout);
        athome = (LinearLayout) findViewById(R.id.back_athome_workout);
        advanced1 = (LinearLayout) findViewById(R.id.back_advanced1_workout);
        advanced2 = (LinearLayout) findViewById(R.id.back_advanced2_workout);
        advanced3 = (LinearLayout) findViewById(R.id.back_advanced3_workout);

        back = (Button) findViewById(R.id.backworkoutbackbtn);

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
                Intent intent = new Intent(getApplicationContext(), BeginnerBackWorkoutActivity.class);
                startActivity(intent);
            }
        });
        min15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Min15BackWorkoutActivity.class);
                startActivity(intent);
            }
        });
        athome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AthomeBackWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Advanced1BackWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Advanced2BackWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Advanced3BackWorkoutActivity.class);
                startActivity(intent);
            }
        });
    }
}