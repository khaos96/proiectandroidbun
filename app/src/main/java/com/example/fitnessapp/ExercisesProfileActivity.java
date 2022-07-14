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
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class ExercisesProfileActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    NavigationView navigationView;
    TextView toolbarTitle;
    DrawerLayout drawerLayout;
    ImageView bmi,favoite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_exercises);


        drawerLayout = findViewById(R.id.drawer_layout);
        bmi = (ImageView) findViewById(R.id.bmicalculator_beginner);
        favoite = (ImageView) findViewById(R.id.favoritelist_beginner);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);


        toolbar.setTitle("");
        toolbarTitle.setText("Profile ");

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home_a);



        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BIMSplashScreenBeginnerActivity.class);
                startActivity(intent);
            }
        });
        favoite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChooseFavoriteBeginnerActivity.class);
                startActivity(intent);
            }
        });



    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.nav_home_a:
                Intent intent0 = new Intent(ExercisesProfileActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate_a:
                Intent intent1 = new Intent(ExercisesProfileActivity.this, WorkoutsActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_logout_a:
                Intent intent5 = new Intent(ExercisesProfileActivity.this, SignInActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_progress_a:
                Intent intent25 = new Intent(ExercisesProfileActivity.this, ProgressActivity.class);
                startActivity(intent25);
                break;
        }


        return true;

    }
}