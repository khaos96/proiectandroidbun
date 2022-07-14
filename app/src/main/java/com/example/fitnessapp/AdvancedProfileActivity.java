package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdvancedProfileActivity extends AppCompatActivity {

    ImageView back,bmi,favoite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_profile);

        back = (ImageView) findViewById(R.id.backhome_advanced);
        bmi = (ImageView) findViewById(R.id.bmicalculator_advanced);
        favoite = (ImageView) findViewById(R.id.favoritelist_advanced);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AdvancedActivity.class);
                startActivity(intent);
            }
        });
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BIMSplashScreenAdvancedActivity.class);
                startActivity(intent);
            }
        });


    }
}