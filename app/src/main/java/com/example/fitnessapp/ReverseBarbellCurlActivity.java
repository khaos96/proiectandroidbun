package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReverseBarbellCurlActivity extends AppCompatActivity {

    Button backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse_barbell_curl);

        backbtn = (Button) findViewById(R.id.reversebarbellcurlbtn);




        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReverseBarbellCurlActivity.this, ExercisesForearmActivity.class);
                startActivity(intent);
            }
        });
    }
}