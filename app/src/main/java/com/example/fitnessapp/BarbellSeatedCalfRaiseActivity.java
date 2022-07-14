package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarbellSeatedCalfRaiseActivity extends AppCompatActivity {

    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbell_seated_calf_raise);

        backbtn = (Button) findViewById(R.id.sbarbellcalfraisebtn);




        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BarbellSeatedCalfRaiseActivity.this, ExercisesLegActivity.class);
                startActivity(intent);
            }
        });
    }
}