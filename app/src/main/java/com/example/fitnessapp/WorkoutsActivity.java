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

public class WorkoutsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout chest, back, delt, biceps, triceps, upperbody, legs, abdomen, fullbody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        chest = (LinearLayout) findViewById(R.id.chest_workout);
        back = (LinearLayout) findViewById(R.id.back_workout);
        delt = (LinearLayout) findViewById(R.id.neck_shoulder_workout);
        biceps = (LinearLayout) findViewById(R.id.biceps_workout);
        triceps = (LinearLayout) findViewById(R.id.triceps_workout);
        upperbody = (LinearLayout) findViewById(R.id.upperbody_workout);
        legs = (LinearLayout) findViewById(R.id.legs_workout);
        abdomen = (LinearLayout) findViewById(R.id.abdomen_workout);
        fullbody = (LinearLayout) findViewById(R.id.fullbody_workout);


        toolbar.setTitle("");
        toolbarTitle.setText("Workouts ");

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home_i);

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChestWorkoutActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BackWorkoutActivity.class);
                startActivity(intent);
            }
        });
        biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BicepsWorkoutActivity.class);
                startActivity(intent);
            }
        });
        triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TricepsWorkoutActivity.class);
                startActivity(intent);
            }
        });
        delt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DeltsWorkoutActivity.class);
                startActivity(intent);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LegsWorkoutActivity.class);
                startActivity(intent);
            }
        });

        abdomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AbdomenWorkoutActivity.class);
                startActivity(intent);
            }
        });
        upperbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UpperbodyWorkoutActivity.class);
                startActivity(intent);
            }
        });
        fullbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FullbodyWorkoutActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.nav_home_i:
                Intent intent0 = new Intent(WorkoutsActivity.this, WorkoutsActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchbeginner_i:
                Intent intent1 = new Intent(WorkoutsActivity.this, ExercisesActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_profile_i:
                Intent intent3 = new Intent(WorkoutsActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_logout_i:
                Intent intent5 = new Intent(WorkoutsActivity.this, SignInActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_progress_i:
                Intent intent15 = new Intent(WorkoutsActivity.this, ProgressActivity.class);
                startActivity(intent15);
                break;
        }


        return true;

    }
}