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

public class ExercisesLegActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout barbellseatedcalfraise,barbellsquat,stepup,lunge,deadlift,standingcalfraise,seatedbarbellcalfraise,kickback,standinghipabduction,standinghipadduction,sledsquat,legpress,machinelegextension,machinelyinglegcurl,machinestandingcalfraise,calfpress45,seatedcalfraise,seatedhipadduction,seatedhipabduction,standinghipextension,hipflfexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_leg);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        barbellsquat = (LinearLayout) findViewById(R.id.barbell_squat);
        stepup = (LinearLayout) findViewById(R.id.step_up);
        lunge = (LinearLayout) findViewById(R.id.lunge);
        deadlift = (LinearLayout) findViewById(R.id.deadlift);
        standingcalfraise = (LinearLayout) findViewById(R.id.standing_calf_raise);
        seatedbarbellcalfraise = (LinearLayout) findViewById(R.id.barbell_seated_calf_raise);
        kickback = (LinearLayout) findViewById(R.id.kick_back);
        standinghipabduction = (LinearLayout) findViewById(R.id.standing_hip_abduction);
        standinghipadduction = (LinearLayout) findViewById(R.id.standing_hip_adduction);
        sledsquat = (LinearLayout) findViewById(R.id.sled_squat);
        legpress = (LinearLayout) findViewById(R.id.leg_press);
        machinelegextension = (LinearLayout) findViewById(R.id.machine_leg_extension);
        machinelyinglegcurl = (LinearLayout) findViewById(R.id.machine_lying_leg_curl);
        machinestandingcalfraise = (LinearLayout) findViewById(R.id.machine_standing_calf_raise);
        calfpress45 = (LinearLayout) findViewById(R.id.calf_press);
        seatedcalfraise = (LinearLayout) findViewById(R.id.seated_calf_raise);
        seatedhipadduction = (LinearLayout) findViewById(R.id.seated_hip_adduction);
        seatedhipabduction = (LinearLayout) findViewById(R.id.seated_hip_abduction);
        standinghipextension = (LinearLayout) findViewById(R.id.standing_hip_extension);
        hipflfexion = (LinearLayout) findViewById(R.id.hip_flexion);








        toolbar.setTitle("");
        toolbarTitle.setText("Legs Exercises");


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
                Intent intent0 = new Intent(ExercisesLegActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate:
                Intent intent = new Intent(ExercisesLegActivity.this, WorkoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                Intent intent2 = new Intent(ExercisesLegActivity.this, SignInActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_profile:
                Intent intent3 = new Intent(ExercisesLegActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_chest_exercises:
                Intent intent11 = new Intent(ExercisesLegActivity.this, ExercisesChestActivity.class);
                startActivity(intent11);
                break;
            case R.id.nav_back_exercises:
                Intent intent4 = new Intent(ExercisesLegActivity.this, ExercisesBackActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_neckshoulder_exercises:
                Intent intent5 = new Intent(ExercisesLegActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_biceps_exercises:
                Intent intent6 = new Intent(ExercisesLegActivity.this, ExercisesBicepsActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_triceps_exercises:
                Intent intent7 = new Intent(ExercisesLegActivity.this, ExercisesTricepsActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_forearm_exercises:
                Intent intent8 = new Intent(ExercisesLegActivity.this, ExercisesForearmActivity.class);
                startActivity(intent8);
                break;
            case R.id.nav_legs_workout:
                Intent intent9 = new Intent(ExercisesLegActivity.this, ExercisesLegActivity.class);
                startActivity(intent9);
                break;
            case R.id.nav_abdominal_exercises:
                Intent intent10 = new Intent(ExercisesLegActivity.this, ExercisesAbdomenLBActivity.class);
                startActivity(intent10);
                break;

        }

        return true;
    }

    public void SwitchActivity() {

        barbellsquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, BarbellSquatActivity.class);
                startActivity(intent);
            }
        });
        stepup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, StepUpActivity.class);
                startActivity(intent);
            }
        });
        lunge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, LungeActivity.class);
                startActivity(intent);
            }
        });
        deadlift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, DeadLiftLegActivity.class);
                startActivity(intent);
            }
        });
        standingcalfraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, StandingCalfRaiseActivity.class);
                startActivity(intent);
            }
        });
        kickback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, KickBackActivity.class);
                startActivity(intent);
            }
        });
        standinghipabduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, StandingHipAbductionActivity.class);
                startActivity(intent);
            }
        });
        standinghipadduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, StandingHipAdductionActivity.class);
                startActivity(intent);
            }
        });
        sledsquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, SledSquatActivity.class);
                startActivity(intent);
            }
        });
        legpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, LegPressActivity.class);
                startActivity(intent);
            }
        });
        machinelegextension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, MachineLegExtensionActivity.class);
                startActivity(intent);
            }
        });
        machinelyinglegcurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, MachineLyingLegCurlActivity.class);
                startActivity(intent);
            }
        });
        machinestandingcalfraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, MachineStandingCalfRaiseActivity.class);
                startActivity(intent);
            }
        });
        calfpress45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, CalfPress45Activity.class);
                startActivity(intent);
            }
        });
        seatedcalfraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, SeatedCalfRaiseActivity.class);
                startActivity(intent);
            }
        });
        seatedhipadduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, SeatedHipAdductionActivity.class);
                startActivity(intent);
            }
        });
        seatedhipabduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, SeatedHipAbductionActivity.class);
                startActivity(intent);
            }
        });
        standinghipextension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, StandingHipExtensionActivity.class);
                startActivity(intent);
            }
        });
        hipflfexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, HipFlexionActivity.class);
                startActivity(intent);
            }
        });
        seatedbarbellcalfraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesLegActivity.this, BarbellSeatedCalfRaiseActivity.class);
                startActivity(intent);
            }
        });
    }


}