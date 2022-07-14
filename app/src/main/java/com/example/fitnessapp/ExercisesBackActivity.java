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

public class ExercisesBackActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout chinup,onearmmachinelat,bentoverbarbelllow,tbarlow,bentoverdumb,dumbellpullover,machinelatpulldown,cablepulldown,seatedcablerow,machineseatedrow,standinglowcablerow,standingcablepullover,assistedpullup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_back);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        chinup = (LinearLayout) findViewById(R.id.chin_up);
        bentoverbarbelllow = (LinearLayout) findViewById(R.id.bent_over_barbell_row);
        tbarlow = (LinearLayout) findViewById(R.id.t_bar_row);
        bentoverdumb = (LinearLayout) findViewById(R.id.bent_over_dumb);
        dumbellpullover = (LinearLayout) findViewById(R.id.dumbbell_pull_over);
        machinelatpulldown = (LinearLayout) findViewById(R.id.machine_lat_pull_down);
        cablepulldown = (LinearLayout) findViewById(R.id.cable_pull_down);
        seatedcablerow = (LinearLayout) findViewById(R.id.seated_cable_row);
        machineseatedrow = (LinearLayout) findViewById(R.id.machine_seated_row);
        standinglowcablerow = (LinearLayout) findViewById(R.id.standing_low_cable_row);
        standingcablepullover = (LinearLayout) findViewById(R.id.standing_cable_pull_over);
        assistedpullup = (LinearLayout) findViewById(R.id.assisted_pull_up);
        onearmmachinelat = (LinearLayout) findViewById(R.id.one_arm_machine_lat_pull_down);






        toolbar.setTitle("");
        toolbarTitle.setText("Back Exercises ");


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
                Intent intent0 = new Intent(ExercisesBackActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate:
                Intent intent = new Intent(ExercisesBackActivity.this, WorkoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                Intent intent2 = new Intent(ExercisesBackActivity.this, SignInActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_profile:
                Intent intent3 = new Intent(ExercisesBackActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_chest_exercises:
                Intent intent11 = new Intent(ExercisesBackActivity.this, ExercisesChestActivity.class);
                startActivity(intent11);
                break;
            case R.id.nav_back_exercises:
                Intent intent4 = new Intent(ExercisesBackActivity.this, ExercisesBackActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_neckshoulder_exercises:
                Intent intent5 = new Intent(ExercisesBackActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_biceps_exercises:
                Intent intent6 = new Intent(ExercisesBackActivity.this, ExercisesBicepsActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_triceps_exercises:
                Intent intent7 = new Intent(ExercisesBackActivity.this, ExercisesTricepsActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_forearm_exercises:
                Intent intent8 = new Intent(ExercisesBackActivity.this, ExercisesForearmActivity.class);
                startActivity(intent8);
                break;
            case R.id.nav_legs_workout:
                Intent intent9 = new Intent(ExercisesBackActivity.this, ExercisesLegActivity.class);
                startActivity(intent9);
                break;
            case R.id.nav_abdominal_exercises:
                Intent intent10 = new Intent(ExercisesBackActivity.this, ExercisesAbdomenLBActivity.class);
                startActivity(intent10);
                break;

        }

        return true;
    }

    public void SwitchActivity() {

        chinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, ChinUpActivity.class);
                startActivity(intent);
            }
        });
        bentoverbarbelllow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, BentOverBarbellLowActivity.class);
                startActivity(intent);
            }
        });
        tbarlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, TBarRowActivity.class);
                startActivity(intent);
            }
        });
        bentoverdumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, BentOverDumbActivity.class);
                startActivity(intent);
            }
        });
        dumbellpullover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, DumbPullOverBackActivity.class);
                startActivity(intent);
            }
        });
        machinelatpulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, MachineLatPullDownActivity.class);
                startActivity(intent);
            }
        });
        cablepulldown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, CablePullDownActivity.class);
                startActivity(intent);
            }
        });
        seatedcablerow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, SeatedCableRowActivity.class);
                startActivity(intent);
            }
        });
        machineseatedrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, MachineSeatedRowActivity.class);
                startActivity(intent);
            }
        });
        standinglowcablerow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, StandingLowCableRowActivity.class);
                startActivity(intent);
            }
        });
        standingcablepullover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        Intent intent = new Intent(ExercisesBackActivity.this, StandingCablePullOverActivity.class);
                startActivity(intent);
            }
        });
        assistedpullup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, AssistedPullUpActivity.class);
                startActivity(intent);
            }
        });
        onearmmachinelat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesBackActivity.this, OneArmMachineLatActivity.class);
                startActivity(intent);
            }
        });



    }


}