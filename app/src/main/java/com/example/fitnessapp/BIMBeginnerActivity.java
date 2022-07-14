package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class BIMBeginnerActivity extends AppCompatActivity {
    Button back, calculate;
    TextView currentheight, currentage, currentweight;
    ImageView incrementage, incrementweight, decrementage, decrementweight;
    SeekBar seekbarheight;
    RelativeLayout male, female;

    int intweight = 60;
     int intage = 18;
     int currentprogress;
     String intprogress = "0";
     String typeofuser = "0";
     String weight2 = "60";
     String age2 = "18";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimbeginner);

        back = (Button) findViewById(R.id.bmibackbutton_beginner);
        calculate = (Button) findViewById(R.id.calculatebmi_beginner);

        currentheight = (TextView) findViewById(R.id.currentheight_beginner);
        currentage = (TextView) findViewById(R.id.currentage_beginner);
        currentweight = (TextView) findViewById(R.id.currentweight_beginner);
        incrementage = (ImageView) findViewById(R.id.incrementage_beginner);
        incrementweight = (ImageView) findViewById(R.id.incrementweight_beginner);
        decrementage = (ImageView) findViewById(R.id.decrementage_beginner);
        decrementweight = (ImageView) findViewById(R.id.decrementweight_beginner);
        seekbarheight = (SeekBar) findViewById(R.id.seekbarforheight_beginner);
        male = (RelativeLayout) findViewById(R.id.male_beginner);
        female = (RelativeLayout) findViewById(R.id.female_beginner);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                male.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.malefemalefocus));
                female.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.malefemalenotfocused));
                typeofuser = "Male";
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                female.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.malefemalefocus));
                male.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.malefemalenotfocused));
                typeofuser = "Female";
            }
        });

        seekbarheight.setMax(300);
        seekbarheight.setProgress(0);

        seekbarheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                currentprogress = progress;
                intprogress = String.valueOf(currentprogress);
                currentheight.setText(intprogress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        incrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intage = intage + 1;
                age2 = String.valueOf(intage);
                currentage.setText(age2);
            }
        });

        incrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intweight = intweight + 1;
                weight2 = String.valueOf(intweight);
                currentweight.setText(weight2);
            }
        });

        decrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intweight = intweight - 1;
                weight2 = String.valueOf(intweight);
                currentweight.setText(weight2);
            }
        });

        decrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intage = intage - 1;
                age2 = String.valueOf(intage);
                currentage.setText(age2);
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExercisesProfileActivity.class);
                startActivity(intent);
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (typeofuser.equals("0")) {
                    Toast.makeText(getApplicationContext(), "Select your Gender", Toast.LENGTH_SHORT).show();
                } else if (intprogress.equals("0")) {

                    Toast.makeText(getApplicationContext(), "Select your Height", Toast.LENGTH_SHORT).show();
                } else if (intage == 0 || intage < 0) {

                    Toast.makeText(getApplicationContext(), "Age incorrect", Toast.LENGTH_SHORT).show();
                } else if (intweight == 0 || intweight < 0) {

                    Toast.makeText(getApplicationContext(), "Weight incorrect", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(getApplicationContext(), BIMCalculatorBeginnerActivity.class);

                    intent.putExtra("gender", typeofuser);
                    intent.putExtra("height", intprogress);
                    intent.putExtra("weight", weight2);
                    intent.putExtra("age", age2);

                    startActivity(intent);
                }


            }
        });


    }
}