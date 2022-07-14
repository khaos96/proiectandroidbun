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

public class AdvancedActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout chest,back,neckshoulder,biceps,triceps,forearm,legs,abdomenlowerback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);
        chest = (LinearLayout) findViewById(R.id.chest_advanced);
        back = (LinearLayout) findViewById(R.id.back_advanced);
        neckshoulder = (LinearLayout) findViewById(R.id.neck_shoulder_advanced);
        biceps = (LinearLayout) findViewById(R.id.biceps_advanced);
        triceps = (LinearLayout) findViewById(R.id.triceps_advanced);
        forearm = (LinearLayout) findViewById(R.id.forearm_advanced);
        legs = (LinearLayout) findViewById(R.id.legs_advanced);
        abdomenlowerback = (LinearLayout) findViewById(R.id.abdomen_lowerback_advanced);

        toolbar.setTitle("");
        toolbarTitle.setText("Advanced ");

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //navigationView.setNavigationItemSelectedListener(this::onNavigationItemSelected);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home_a);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChestAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BackAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BicepsAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TricepsAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
        neckshoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NeckShoulderAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
        forearm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ForearmAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LegsAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });
        abdomenlowerback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AbdomenLBAdvancedWorkoutActivity.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_home_a:
                Intent intent0 = new Intent(AdvancedActivity.this, AdvancedActivity.class);
                startActivity(intent0);
                break;

            case R.id.nav_switchintermediate_a:
                Intent intent2 = new Intent(AdvancedActivity.this, WorkoutsActivity.class);
                startActivity(intent2);
                break;


            case R.id.nav_logout_a:
                Intent intent5 = new Intent(AdvancedActivity.this, SignInActivity.class);
                startActivity(intent5);
                break;
        }


        return true;
    }
}