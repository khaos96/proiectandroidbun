package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChooseFavoriteBeginnerActivity extends AppCompatActivity {

    Button back;
    ImageView favlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_favorite_beginner);

        favlist = (ImageView) findViewById(R.id.favoritelistex);
        back = (Button) findViewById(R.id.backfavoritelistexercisesbtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesProfileActivity.class);
                startActivity(intent);
            }
        });
        favlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FavoriteListExercisesActivity.class);
                startActivity(intent);
            }
        });
    }
}