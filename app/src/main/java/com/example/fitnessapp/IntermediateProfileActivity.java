package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntermediateProfileActivity extends AppCompatActivity {

    ImageView back,bmi,favoite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_profile);

        back = (ImageView) findViewById(R.id.backhome_intermediate);
        bmi = (ImageView) findViewById(R.id.bmicalculator_intermediate);
        favoite = (ImageView) findViewById(R.id.favoritelist_intermediate);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WorkoutsActivity.class);
                startActivity(intent);
            }
        });

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BIMSplashScreenIntermediateActivity.class);
                startActivity(intent);
            }
        });
        favoite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChooseFavoriteIntermediateActivity.class);
                startActivity(intent);
            }
        });



    }
}