package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class ExercisesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout chest,back,neckshoulder,biceps,triceps,forearm,legs,abdomenlowerback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);
        chest = (LinearLayout) findViewById(R.id.chest_beginner);
        back = (LinearLayout) findViewById(R.id.back_beginner);
        neckshoulder = (LinearLayout) findViewById(R.id.neck_shoulder_beginner);
        biceps = (LinearLayout) findViewById(R.id.biceps_beginner);
        triceps = (LinearLayout) findViewById(R.id.triceps_beginner);
        forearm = (LinearLayout) findViewById(R.id.forearm_beginner);
        legs = (LinearLayout) findViewById(R.id.legs_beginner);
        abdomenlowerback = (LinearLayout) findViewById(R.id.abdomen_lowerback_beginner);




        toolbar.setTitle("");
        toolbarTitle.setText("Exercises");


        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);


        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesChestActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesBackActivity.class);
                startActivity(intent);
            }
        });

        neckshoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesNeckShoulderActivity.class);
                startActivity(intent);
            }
        });

        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesBicepsActivity.class);
                startActivity(intent);
            }
        });
        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesTricepsActivity.class);
                startActivity(intent);
            }
        });
        forearm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesForearmActivity.class);
                startActivity(intent);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesLegActivity.class);
                startActivity(intent);
            }
        });
        abdomenlowerback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesAbdomenLBActivity.class);
                startActivity(intent);
            }
        });




    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()) {
            case R.id.nav_home:
                Intent intent0 = new Intent(ExercisesActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate:
                Intent intent = new Intent(ExercisesActivity.this, WorkoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                Intent intent2 = new Intent(ExercisesActivity.this, SignInActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_progress:
                Intent intent20 = new Intent(ExercisesActivity.this, ProgressActivity.class);
                startActivity(intent20);
                break;
            case R.id.nav_profile:
                Intent intent3 = new Intent(ExercisesActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_chest_exercises:
                Intent intent11 = new Intent(ExercisesActivity.this, ExercisesChestActivity.class);
                startActivity(intent11);
                break;
            case R.id.nav_back_exercises:
                Intent intent4 = new Intent(ExercisesActivity.this, ExercisesBackActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_neckshoulder_exercises:
                Intent intent5 = new Intent(ExercisesActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_biceps_exercises:
                Intent intent6 = new Intent(ExercisesActivity.this, ExercisesBicepsActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_triceps_exercises:
                Intent intent7 = new Intent(ExercisesActivity.this, ExercisesTricepsActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_forearm_exercises:
                Intent intent8 = new Intent(ExercisesActivity.this, ExercisesForearmActivity.class);
                startActivity(intent8);
                break;
            case R.id.nav_legs_workout:
                Intent intent9 = new Intent(ExercisesActivity.this, ExercisesLegActivity.class);
                startActivity(intent9);
                break;
            case R.id.nav_abdominal_exercises:
                Intent intent10 = new Intent(ExercisesActivity.this, ExercisesAbdomenLBActivity.class);
                startActivity(intent10);
                break;

        }


        return true;
    }






}