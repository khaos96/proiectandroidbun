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

public class ExercisesTricepsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView toolbarTitle;
    LinearLayout lfrenchpress,dfrenchpress,parallelbardip,tpushup,dkickback,narrowgrip,overheadextension,cablepushdown,ropepushdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises_triceps);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        lfrenchpress = (LinearLayout) findViewById(R.id.lying_french_press);
        dfrenchpress = (LinearLayout) findViewById(R.id.dumbbell_french_press);
        parallelbardip = (LinearLayout) findViewById(R.id.parallel_bar_dip);
        tpushup = (LinearLayout) findViewById(R.id.triceps_push_up);
        dkickback = (LinearLayout) findViewById(R.id.dumbbell_kick_back);
        narrowgrip = (LinearLayout) findViewById(R.id.narrow_grip_bench_press);
        overheadextension = (LinearLayout) findViewById(R.id.dumbbell_overhead_triceps_extension);
        cablepushdown = (LinearLayout) findViewById(R.id.cable_push_down);
        ropepushdown = (LinearLayout) findViewById(R.id.rope_push_down);



        toolbar.setTitle("");
        toolbarTitle.setText("Triceps Exercises ");


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
                Intent intent0 = new Intent(ExercisesTricepsActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate:
                Intent intent = new Intent(ExercisesTricepsActivity.this, WorkoutsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                Intent intent2 = new Intent(ExercisesTricepsActivity.this, SignInActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_profile:
                Intent intent3 = new Intent(ExercisesTricepsActivity.this, ExercisesProfileActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_chest_exercises:
                Intent intent11 = new Intent(ExercisesTricepsActivity.this, ExercisesChestActivity.class);
                startActivity(intent11);
                break;
            case R.id.nav_back_exercises:
                Intent intent4 = new Intent(ExercisesTricepsActivity.this, ExercisesBackActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_neckshoulder_exercises:
                Intent intent5 = new Intent(ExercisesTricepsActivity.this, ExercisesNeckShoulderActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_biceps_exercises:
                Intent intent6 = new Intent(ExercisesTricepsActivity.this, ExercisesBicepsActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_triceps_exercises:
                Intent intent7 = new Intent(ExercisesTricepsActivity.this, ExercisesTricepsActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_forearm_exercises:
                Intent intent8 = new Intent(ExercisesTricepsActivity.this, ExercisesForearmActivity.class);
                startActivity(intent8);
                break;
            case R.id.nav_legs_workout:
                Intent intent9 = new Intent(ExercisesTricepsActivity.this, ExercisesLegActivity.class);
                startActivity(intent9);
                break;
            case R.id.nav_abdominal_exercises:
                Intent intent10 = new Intent(ExercisesTricepsActivity.this, ExercisesAbdomenLBActivity.class);
                startActivity(intent10);
                break;

        }

        return true;
    }

    public void SwitchActivity() {

        lfrenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, LyingFrenchPressActivity.class);
                startActivity(intent);
            }
        });
        dfrenchpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, DumbbellFrenchPressActivity.class);
                startActivity(intent);
            }
        });
        parallelbardip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, ParallelBarDipActivity.class);
                startActivity(intent);
            }
        });
        tpushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, TricepsPushUpActivity.class);
                startActivity(intent);
            }
        });
        dkickback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, DumbbellKickBackActivity.class);
                startActivity(intent);
            }
        });
        narrowgrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, NarrowGripBenchPressActivity.class);
                startActivity(intent);
            }
        });
        overheadextension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, DumbbellOverheadTricepsExtensionActivity.class);
                startActivity(intent);
            }
        });
        cablepushdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, CablePushDownActivity.class);
                startActivity(intent);
            }
        });
        ropepushdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ExercisesTricepsActivity.this, RopePushDownActivity.class);
                startActivity(intent);
            }
        });
    }


}