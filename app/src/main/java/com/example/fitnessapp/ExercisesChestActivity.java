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

public class ExercisesChestActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout benchpress, ibenchpress, dbenchpress, dumbellpress, dumbellfly, pushup, paralleldip, dumbellpullover, machinebenchpress, multipower, cablecrossover, cableflye, butterflypress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_chest);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        benchpress = (LinearLayout) findViewById(R.id.bench_press);
        ibenchpress = (LinearLayout) findViewById(R.id.incline_bench_press);
        dbenchpress = (LinearLayout) findViewById(R.id.decline_bench_press);
        dumbellpress = (LinearLayout) findViewById(R.id.dumbbell_press);
        dumbellfly = (LinearLayout) findViewById(R.id.dumbbell_flyes);
        pushup = (LinearLayout) findViewById(R.id.pushups);
        paralleldip = (LinearLayout) findViewById(R.id.parallel_dips);
        dumbellpullover = (LinearLayout) findViewById(R.id.dumbbell_pullover);
        machinebenchpress = (LinearLayout) findViewById(R.id.machine_bench_press);
        multipower = (LinearLayout) findViewById(R.id.multi_power_bench_press);
        cablecrossover = (LinearLayout) findViewById(R.id.cable_crossover);
        cableflye = (LinearLayout) findViewById(R.id.cable_flyes);
        butterflypress = (LinearLayout) findViewById(R.id.butterfly_press);


        toolbar.setTitle("");
        toolbarTitle.setText("Chest Exercises");


        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
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
                Intent intent0 = new Intent(ExercisesChestActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate:
                Intent intent = new Intent(ExercisesChestActivity.this, WorkoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                Intent intent2 = new Intent(ExercisesChestActivity.this, SignInActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_profile:
                Intent intent3 = new Intent(ExercisesChestActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_chest_exercises:
                Intent intent11 = new Intent(ExercisesChestActivity.this, ExercisesChestActivity.class);
                startActivity(intent11);
                break;
            case R.id.nav_back_exercises:
                Intent intent4 = new Intent(ExercisesChestActivity.this, ExercisesBackActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_neckshoulder_exercises:
                Intent intent5 = new Intent(ExercisesChestActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_biceps_exercises:
                Intent intent6 = new Intent(ExercisesChestActivity.this, ExercisesBicepsActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_triceps_exercises:
                Intent intent7 = new Intent(ExercisesChestActivity.this, ExercisesTricepsActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_forearm_exercises:
                Intent intent8 = new Intent(ExercisesChestActivity.this, ExercisesForearmActivity.class);
                startActivity(intent8);
                break;
            case R.id.nav_legs_workout:
                Intent intent9 = new Intent(ExercisesChestActivity.this, ExercisesLegActivity.class);
                startActivity(intent9);
                break;
            case R.id.nav_abdominal_exercises:
                Intent intent10 = new Intent(ExercisesChestActivity.this, ExercisesAbdomenLBActivity.class);
                startActivity(intent10);
                break;

        }

        return true;
    }

    public void SwitchActivity() {

        benchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, BenchPressActivity.class);
                startActivity(intent);
            }
        });

        ibenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, InclineBenchPressActivity.class);
                startActivity(intent);
            }
        });
        dbenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, DeclineBenchPressActivity.class);
                startActivity(intent);
            }
        });
        dumbellpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, DumbbellPressActivity.class);
                startActivity(intent);
            }
        });
        dumbellfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, DumbbellFlyesActivity.class);
                startActivity(intent);
            }
        });
        pushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, PushupActivity.class);
                startActivity(intent);
            }
        });
        paralleldip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, ParallelDipsActivity.class);
                startActivity(intent);
            }
        });
        dumbellpullover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, DumbbellPullOverActivity.class);
                startActivity(intent);
            }
        });
        machinebenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, MachineBenchPressActivity.class);
                startActivity(intent);
            }
        });
        multipower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, MultiPowerBenchPressActivity.class);
                startActivity(intent);
            }
        });
        cablecrossover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, CableCrossoverActivity.class);
                startActivity(intent);
            }
        });
        cableflye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, CableFlyesActivity.class);
                startActivity(intent);
            }
        });
        butterflypress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesChestActivity.this, ButterflyPressActivity.class);
                startActivity(intent);
            }
        });

    }

}