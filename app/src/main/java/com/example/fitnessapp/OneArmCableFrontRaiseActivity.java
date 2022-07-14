package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneArmCableFrontRaiseActivity extends AppCompatActivity {

    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_arm_cable_front_raise);

        backbtn = (Button) findViewById(R.id.onearmcablefrontraisebtn);




        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OneArmCableFrontRaiseActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent);
            }
        });
    }
}