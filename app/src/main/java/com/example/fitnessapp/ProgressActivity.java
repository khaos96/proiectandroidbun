
package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class ProgressActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    EditText date, musclegroup, workouttype, workoutvolume, maxrep, weight, measurements;
    Button add, view;
    DBHelper yourpersonaltrainer;
    Toolbar toolbar;
    TextView toolbarTitle;
    NavigationView navigationView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitle = (TextView) findViewById(R.id.titleText);

        date = (EditText) findViewById(R.id.editdate);
        musclegroup = (EditText) findViewById(R.id.editmusclegroup);
        workouttype = (EditText) findViewById(R.id.editworkouttype);
        workoutvolume = (EditText) findViewById(R.id.editvolume);
        maxrep = (EditText) findViewById(R.id.editmarep);
        weight = (EditText) findViewById(R.id.editweight);
        measurements = (EditText) findViewById(R.id.editmeasure);

        add = findViewById(R.id.trackprogress);
        view = findViewById(R.id.viewprogress);


        yourpersonaltrainer = new DBHelper(this);

        toolbar.setTitle("");
        toolbarTitle.setText("");

        setSupportActionBar(toolbar);


        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home_a);

        createNotification();


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringdate = date.getText().toString();
                String stringmuscle = musclegroup.getText().toString();
                String stringtype = workouttype.getText().toString();
                String stringvolume = workoutvolume.getText().toString();
                String stringmax = maxrep.getText().toString();
                String stringweight = weight.getText().toString();
                String stringmeasurements = weight.getText().toString();


                if (stringdate.equals("") || stringmuscle.equals("") || stringtype.equals("") || stringvolume.equals("") || stringmax.equals("") || stringweight.equals("") || stringmeasurements.equals("")) {

                    Toast.makeText(ProgressActivity.this, "Fill all the fields!", Toast.LENGTH_SHORT).show();
                } else {
                    yourpersonaltrainer.addProgress(stringdate, stringmuscle, stringtype, stringvolume, stringmax, stringweight, stringmeasurements);
                    Toast.makeText(ProgressActivity.this, "Data introduced!", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());

                }


                    Intent intent = new Intent(ProgressActivity.this,Reminder.class);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(ProgressActivity.this,0,intent,0);

                AlarmManager alarmManager =(AlarmManager) getSystemService(ALARM_SERVICE);

                long timeAtButtonClick = System.currentTimeMillis();
                long tenSeconds = 1000 * 10;

                alarmManager.set(AlarmManager.RTC_WAKEUP,timeAtButtonClick + tenSeconds, pendingIntent);
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ViewProgressActivity.class);
                startActivity(intent);
            }
        });


    }

    private void createNotification(){

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "FitnessAppChanel";
            String description = "Chanel for progress reminder";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("notify",name,importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);

        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nav_home_p:
                Intent intent0 = new Intent(ProgressActivity.this, ExercisesActivity.class);
                startActivity(intent0);
                break;
            case R.id.nav_switchintermediate_p:
                Intent intent1 = new Intent(ProgressActivity.this, WorkoutsActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_logout_p:
                Intent intent5 = new Intent(ProgressActivity.this, SignInActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_profile_p:
                Intent intent15 = new Intent(ProgressActivity.this, ExercisesProfileActivity.class);
                startActivity(intent15);
                break;
        }


        return false;
    }
}

