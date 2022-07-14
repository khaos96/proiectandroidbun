package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Chooseworkout extends AppCompatActivity {

    TextView welcome;
    Button beginner,intermediate,advanced;
    Animation animone,animetwo,animethree,animetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseworkout);

        welcome = (TextView) findViewById(R.id.chooseworkout);
        beginner = (Button) findViewById(R.id.beginnerbtn);
        intermediate = (Button) findViewById(R.id.intermediatebtn);


        animone = AnimationUtils.loadAnimation(this,R.anim.btnone);
        animetwo = AnimationUtils.loadAnimation(this,R.anim.btntwo);
        animethree = AnimationUtils.loadAnimation(this,R.anim.btnthree);
        animetext = AnimationUtils.loadAnimation(this,R.anim.textanim);

        welcome.startAnimation(animetext);
        beginner.startAnimation(animone);
        intermediate.startAnimation(animetwo);



        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesActivity.class);
                startActivity(intent);
            }
        });
        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WorkoutsActivity.class);
                startActivity(intent);
            }
        });








    }
}