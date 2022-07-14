package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private static final String FILE_NAME = "myFile";
    Button lgtbtn;
    ImageView imgpage;
    TextView welcomeuser,personname,titlepage,subtitlepage;
    Animation animimg,btnanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animimg = AnimationUtils.loadAnimation(this,R.anim.animimg);
        btnanim = AnimationUtils.loadAnimation(this,R.anim.btnanim);


        lgtbtn = findViewById(R.id.button);
        welcomeuser=findViewById(R.id.username);
        personname=findViewById(R.id.clientname);
        titlepage = (TextView) findViewById(R.id.welcome);
        subtitlepage = (TextView) findViewById(R.id.quote);
        imgpage = (ImageView) findViewById(R.id.main_img);

        imgpage.startAnimation(animimg);
        titlepage.startAnimation(btnanim);
        subtitlepage.startAnimation(btnanim);
        personname.startAnimation(btnanim);

        SharedPreferences sharedPreferences = getSharedPreferences(FILE_NAME,MODE_PRIVATE);
        String username = sharedPreferences.getString("username","Data not found");

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        personname.setText(name);


        lgtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chooseworkout.class);
                startActivity(intent);
            }
        });
    }
}