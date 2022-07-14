package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MachineStandingCalfRaiseActivity extends AppCompatActivity {

    Button backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_standing_calf_raise);

        backbtn = (Button) findViewById(R.id.mstandingcalfraisebtn);




        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MachineStandingCalfRaiseActivity.this, ExercisesLegActivity.class);
                startActivity(intent);
            }
        });
    }
}