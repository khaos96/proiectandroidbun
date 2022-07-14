package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SmithMachineMilitaryPressActivity extends AppCompatActivity {

    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smith_machine_military_press);

        backbtn = (Button) findViewById(R.id.smithpressbtn);




        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SmithMachineMilitaryPressActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent);
            }
        });
    }
}