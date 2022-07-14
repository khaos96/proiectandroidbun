package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BentOverBarbellLowActivity extends AppCompatActivity {

    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bent_over_barbell_low);

        backbtn = (Button) findViewById(R.id.bentoverbarbellrowbtn);




        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BentOverBarbellLowActivity.this, ExercisesBackActivity.class);
                startActivity(intent);
            }
        });
    }
}