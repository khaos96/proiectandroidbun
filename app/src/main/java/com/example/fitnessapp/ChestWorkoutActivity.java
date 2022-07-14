package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChestWorkoutActivity extends AppCompatActivity {

    Button back;
    LinearLayout beginner,min15,athome,advanced1,advanced2,advanced3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout);

        back = (Button) findViewById(R.id.chestworkoutbackbtn);

        beginner = (LinearLayout) findViewById(R.id.chest_beginner_workout);
        min15 = (LinearLayout) findViewById(R.id.chest_15min_workout);
        athome = (LinearLayout) findViewById(R.id.chest_athome_workout);
        advanced1 = (LinearLayout) findViewById(R.id.chest_advanced1_workout);
        advanced2 = (LinearLayout) findViewById(R.id.chest_advanced2_workout);
        advanced3 = (LinearLayout) findViewById(R.id.chest_advanced3_workout);


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
                Intent intent = new Intent(getApplicationContext(), BeginnerChestWorkoutActivity.class);
                startActivity(intent);
            }
        });
        min15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Min15ChestWorkoutActivity.class);
                startActivity(intent);
            }
        });
        athome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AthomeChestWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Advanced1ChestWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Advanced2ChestWorkoutActivity.class);
                startActivity(intent);
            }
        });
        advanced3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Advanced3ChestWorkoutActivity.class);
                startActivity(intent);
            }
        });
    }
}