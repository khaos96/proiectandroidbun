package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HipFlexionActivity extends AppCompatActivity {

    Button backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_flexion);

        backbtn = (Button) findViewById(R.id.hipflexionbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HipFlexionActivity.this, ExercisesLegActivity.class);
                startActivity(intent);
            }
        });
    }
}