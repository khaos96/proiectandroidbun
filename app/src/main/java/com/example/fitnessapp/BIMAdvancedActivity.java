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

public class BIMAdvancedActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_bimadvanced);

        back = (Button) findViewById(R.id.bmibackbutton_advanced);
        calculate = (Button) findViewById(R.id.calculatebmi_advanced);

        currentheight = (TextView) findViewById(R.id.currentheight_advanced);
        currentage = (TextView) findViewById(R.id.currentage_advanced);
        currentweight = (TextView) findViewById(R.id.currentweight_advanced);
        incrementage = (ImageView) findViewById(R.id.incrementage_advanced);
        incrementweight = (ImageView) findViewById(R.id.incrementweight_advanced);
        decrementage = (ImageView) findViewById(R.id.decrementage_advanced);
        decrementweight = (ImageView) findViewById(R.id.decrementweight_advanced);
        seekbarheight = (SeekBar) findViewById(R.id.seekbarforheight_advanced);
        male = (RelativeLayout) findViewById(R.id.male_advanced);
        female = (RelativeLayout) findViewById(R.id.female_advanced);

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

                intweight = intweight + 1; // aici incrementam greutatea
                weight2 = String.valueOf(intweight);
                currentweight.setText(weight2);
            }
        });

        decrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intweight = intweight - 1; // aici decrementam greutatea
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
                Intent intent = new Intent(getApplicationContext(), AdvancedProfileActivity.class);
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

                    Intent intent = new Intent(getApplicationContext(), BIMCalculatorAdvancedActivity.class);


                    intent.putExtra("gender_advanced", typeofuser);
                    intent.putExtra("height_advanced", intprogress);
                    intent.putExtra("weight_advanced", weight2);
                    intent.putExtra("age_advanced", age2);


                    startActivity(intent);
                }


            }
        });


    }
}