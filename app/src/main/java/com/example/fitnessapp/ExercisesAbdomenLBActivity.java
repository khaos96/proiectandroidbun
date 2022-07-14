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

public class ExercisesAbdomenLBActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout backextension,crunches,romanchairsitup,lyinglegraise,verticallegraise,scissorscrunch,twists,sidebend,lateralcrunch,deadlift,seatedmachinecrunch,standingcablecrunch,twister,seatedrowbackextension;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_abdomen_lb);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        backextension = (LinearLayout) findViewById(R.id.back_extension);
        crunches = (LinearLayout) findViewById(R.id.crunches);
        romanchairsitup = (LinearLayout) findViewById(R.id.roman_chair_sit_up);
        lyinglegraise = (LinearLayout) findViewById(R.id.lying_leg_raise);
        verticallegraise = (LinearLayout) findViewById(R.id.vertical_leg_raise);
        scissorscrunch = (LinearLayout) findViewById(R.id.scissors_crunch);
        twists = (LinearLayout) findViewById(R.id.twists);
        sidebend = (LinearLayout) findViewById(R.id.side_bend);
        lateralcrunch = (LinearLayout) findViewById(R.id.lateral_crunch);
        deadlift = (LinearLayout) findViewById(R.id.deadlift_back);
        seatedmachinecrunch = (LinearLayout) findViewById(R.id.seated_machine_crunch);
        standingcablecrunch = (LinearLayout) findViewById(R.id.standing_cable_crunch);
        twister = (LinearLayout) findViewById(R.id.twister);
        seatedrowbackextension = (LinearLayout) findViewById(R.id.seated_row_back_extension);





        toolbar.setTitle("");
        toolbarTitle.setText("Abdomen - Lower Back Exercises");


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
                Intent intent0 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate:
                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, WorkoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                Intent intent2 = new Intent(ExercisesAbdomenLBActivity.this, SignInActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_profile:
                Intent intent3 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_chest_exercises:
                Intent intent11 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesChestActivity.class);
                startActivity(intent11);
                break;
            case R.id.nav_back_exercises:
                Intent intent4 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesBackActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_neckshoulder_exercises:
                Intent intent5 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_biceps_exercises:
                Intent intent6 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesBicepsActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_triceps_exercises:
                Intent intent7 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesTricepsActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_forearm_exercises:
                Intent intent8 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesForearmActivity.class);
                startActivity(intent8);
                break;
            case R.id.nav_legs_workout:
                Intent intent9 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesLegActivity.class);
                startActivity(intent9);
                break;
            case R.id.nav_abdominal_exercises:
                Intent intent10 = new Intent(ExercisesAbdomenLBActivity.this, ExercisesAbdomenLBActivity.class);
                startActivity(intent10);
                break;

        }

        return true;
    }

    public void SwitchActivity() {

        backextension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, BackExtensionActivity.class);
                startActivity(intent);
            }
        });
        crunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, CrunchesActivity.class);
                startActivity(intent);
            }
        });
        romanchairsitup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, RomanChairSitUpActivity.class);
                startActivity(intent);
            }
        });
        lyinglegraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, LyingLegRaiseActivity.class);
                startActivity(intent);
            }
        });
        verticallegraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, VerticalLegRaiseActivity.class);
                startActivity(intent);
            }
        });
        scissorscrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, ScrissorsCrunchActivity.class);
                startActivity(intent);
            }
        });
        twists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, TwistsActivity.class);
                startActivity(intent);
            }
        });
        sidebend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, SideBendActivity.class);
                startActivity(intent);
            }
        });
        lateralcrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, LateralCrunchActivity.class);
                startActivity(intent);
            }
        });
        deadlift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, DeadliftActivity.class);
                startActivity(intent);
            }
        });
        seatedmachinecrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, SeatedMachineCrunchActivity.class);
                startActivity(intent);
            }
        });
        standingcablecrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, StandingCableCrunchActivity.class);
                startActivity(intent);
            }
        });
        twister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, TwisterActivity.class);
                startActivity(intent);
            }
        });
        seatedrowbackextension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesAbdomenLBActivity.this, SeatedRowBackExtensionActivity.class);
                startActivity(intent);
            }
        });
    }


}