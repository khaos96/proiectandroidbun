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

public class ExercisesNeckShoulderActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout cableshrug,cableuprightrow,seatedmachinerearlatraise,onearmcablerearlatraise,onearmcrosscablefrontraise,onearmcrosscablelatraise,mlateralraise,smithpress,machinepress,dshrug,sbarbellmilitarypress,sdumbbellshoulderpress,frontdumbbellpress,shoulderfly,onearmdumbelllateralraise,dumbbellfrontraise,rearlateralraise,lyinglateralraise,barbelluprightrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_neck_shoulder);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        sbarbellmilitarypress = (LinearLayout) findViewById(R.id.seated_barbell_military_press);
        sdumbbellshoulderpress = (LinearLayout) findViewById(R.id.seated_dumbbell_shoulder_press);
        frontdumbbellpress = (LinearLayout) findViewById(R.id.front_dumbbell_press);
        shoulderfly = (LinearLayout) findViewById(R.id.shoulder_fly);
        onearmdumbelllateralraise = (LinearLayout) findViewById(R.id.one_arm_dumbbell_lateral_raise);
        dumbbellfrontraise = (LinearLayout) findViewById(R.id.dumbbell_front_raise);
        rearlateralraise = (LinearLayout) findViewById(R.id.dumbbell_rear_lateral_raise);
        lyinglateralraise = (LinearLayout) findViewById(R.id.dumbbell_lying_lateral_raise);
        barbelluprightrow = (LinearLayout) findViewById(R.id.barbell_upright_row);
        dshrug = (LinearLayout) findViewById(R.id.dumbbell_shrug);
        machinepress = (LinearLayout) findViewById(R.id.machine_shoulder_press);
        smithpress = (LinearLayout) findViewById(R.id.smith_machine_military_press);
        mlateralraise = (LinearLayout) findViewById(R.id.machine_lateral_raise);
        onearmcrosscablelatraise = (LinearLayout) findViewById(R.id.one_arm_cross_cable_lateral_raise);
        onearmcrosscablefrontraise = (LinearLayout) findViewById(R.id.one_arm_cable_front_raise);
        onearmcablerearlatraise = (LinearLayout) findViewById(R.id.one_arm_cable_rear_lateral_raise);
        seatedmachinerearlatraise = (LinearLayout) findViewById(R.id.seated_machine_rear_lateral_raise);
        cableuprightrow = (LinearLayout) findViewById(R.id.cable_upright_row);
        cableshrug = (LinearLayout) findViewById(R.id.cable_shrug);



        toolbar.setTitle("");
        toolbarTitle.setText("Neck - Shoulder Exercises");


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
                Intent intent0 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate:
                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, WorkoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                Intent intent2 = new Intent(ExercisesNeckShoulderActivity.this, SignInActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_profile:
                Intent intent3 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_chest_exercises:
                Intent intent11 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesChestActivity.class);
                startActivity(intent11);
                break;
            case R.id.nav_back_exercises:
                Intent intent4 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesBackActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_neckshoulder_exercises:
                Intent intent5 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_biceps_exercises:
                Intent intent6 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesBicepsActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_triceps_exercises:
                Intent intent7 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesTricepsActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_forearm_exercises:
                Intent intent8 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesForearmActivity.class);
                startActivity(intent8);
                break;
            case R.id.nav_legs_workout:
                Intent intent9 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesLegActivity.class);
                startActivity(intent9);
                break;
            case R.id.nav_abdominal_exercises:
                Intent intent10 = new Intent(ExercisesNeckShoulderActivity.this, ExercisesAbdomenLBActivity.class);
                startActivity(intent10);
                break;

        }

        return true;
    }

    public void SwitchActivity() {

        sbarbellmilitarypress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, SeatedBarbellMilitaryPressActivity.class);
                startActivity(intent);
            }
        });
        sdumbbellshoulderpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, SeatedDumbbellShoulderPressActivity.class);
                startActivity(intent);
            }
        });
        frontdumbbellpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, FrontDumbbellPressActivity.class);
                startActivity(intent);
            }
        });
        shoulderfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, ShoulderFlyActivity.class);
                startActivity(intent);
            }
        });
        onearmdumbelllateralraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, OneArmDumbbellLateralRaiseActivity.class);
                startActivity(intent);
            }
        });
        dumbbellfrontraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, DumbbellFrontRaiseActivity.class);
                startActivity(intent);
            }
        });
        rearlateralraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, DumbbellRearLateralRaiseActivity.class);
                startActivity(intent);
            }
        });
        lyinglateralraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, DumbbellLyingLateralRaiseActivity.class);
                startActivity(intent);
            }
        });
        barbelluprightrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, BarbellUprightRowActivity.class);
                startActivity(intent);
            }
        });
        dshrug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, DumbbellShrugActivity.class);
                startActivity(intent);
            }
        });
        machinepress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, MachineShoulderPressActivity.class);
                startActivity(intent);
            }
        });
        smithpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, SmithMachineMilitaryPressActivity.class);
                startActivity(intent);
            }
        });
        mlateralraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, MachineLateralRaiseActivity.class);
                startActivity(intent);
            }
        });
        onearmcrosscablelatraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, OneArmCrossableLateralRaiseActivity.class);
                startActivity(intent);
            }
        });
        onearmcrosscablefrontraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, OneArmCableFrontRaiseActivity.class);
                startActivity(intent);
            }
        });
        onearmcablerearlatraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, OneArmCableRearLatRaiseActivity.class);
                startActivity(intent);
            }
        });
        seatedmachinerearlatraise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, SeatedMachineRearLatRaiseActivity.class);
                startActivity(intent);
            }
        });
        cableuprightrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, CableUprightRowActivity.class);
                startActivity(intent);
            }
        });
        cableshrug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesNeckShoulderActivity.this, CableShrugActivity.class);
                startActivity(intent);
            }
        });
    }


}