package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class ExercisesBicepsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout barbellcurl,dumbbellcurl,scottcurl,concentrationcurl,machinecurl,cablecurl,onearmcurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_biceps);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        barbellcurl = (LinearLayout) findViewById(R.id.barbell_curl);
        dumbbellcurl = (LinearLayout) findViewById(R.id.dumbbell_curl);
        scottcurl = (LinearLayout) findViewById(R.id.barbell_preacher_curl);
        concentrationcurl = (LinearLayout) findViewById(R.id.dumbbell_concentration_curl);
        machinecurl = (LinearLayout) findViewById(R.id.machine_curl);
        cablecurl = (LinearLayout) findViewById(R.id.cable_curl);
        onearmcurl = (LinearLayout) findViewById(R.id.one_arm_high_cable_curl);





        toolbar.setTitle("");
        toolbarTitle.setText("Biceps Exercises");


        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        SwitchActivity();


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        switch (item.getItemId()) {
            case R.id.nav_home:
                Intent intent0 = new Intent(ExercisesBicepsActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate:
                Intent intent = new Intent(ExercisesBicepsActivity.this, WorkoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                Intent intent2 = new Intent(ExercisesBicepsActivity.this, SignInActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_profile:
                Intent intent3 = new Intent(ExercisesBicepsActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_chest_exercises:
                Intent intent11 = new Intent(ExercisesBicepsActivity.this, ExercisesChestActivity.class);
                startActivity(intent11);
                break;
            case R.id.nav_back_exercises:
                Intent intent4 = new Intent(ExercisesBicepsActivity.this, ExercisesBackActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_neckshoulder_exercises:
                Intent intent5 = new Intent(ExercisesBicepsActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_biceps_exercises:
                Intent intent6 = new Intent(ExercisesBicepsActivity.this, ExercisesBicepsActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_triceps_exercises:
                Intent intent7 = new Intent(ExercisesBicepsActivity.this, ExercisesTricepsActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_forearm_exercises:
                Intent intent8 = new Intent(ExercisesBicepsActivity.this, ExercisesForearmActivity.class);
                startActivity(intent8);
                break;
            case R.id.nav_legs_workout:
                Intent intent9 = new Intent(ExercisesBicepsActivity.this, ExercisesLegActivity.class);
                startActivity(intent9);
                break;
            case R.id.nav_abdominal_exercises:
                Intent intent10 = new Intent(ExercisesBicepsActivity.this, ExercisesAbdomenLBActivity.class);
                startActivity(intent10);
                break;

        }

        return true;
    }

    public void SwitchActivity() {

        barbellcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBicepsActivity.this, BarbellCurlActivity.class);
                startActivity(intent);
            }
        });
        dumbbellcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBicepsActivity.this, DumbbellCurlActivity.class);
                startActivity(intent);
            }
        });
        scottcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBicepsActivity.this, ScottCurlActivity.class);
                startActivity(intent);
            }
        });
        concentrationcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBicepsActivity.this, DumbbellConcentrationCurlActivity.class);
                startActivity(intent);
            }
        });
        machinecurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBicepsActivity.this, MachineCurlActivity.class);
                startActivity(intent);
            }
        });
        cablecurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBicepsActivity.this, CableCurlActivity.class);
                startActivity(intent);
            }
        });
        onearmcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBicepsActivity.this, OneArmCableCurlActivity.class);
                startActivity(intent);
            }
        });

    }



}