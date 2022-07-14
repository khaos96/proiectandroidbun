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

public class BIMIntermediateActivity extends AppCompatActivity {
    Button back, calculate;
    TextView currentheight_i, currentage_i, currentweight_i;
    ImageView incrementage_i, incrementweight_i, decrementage_i, decrementweight_i;
    SeekBar seekbarheight_i;
    RelativeLayout male_i, female_i;

    public int intweight_i = 60;
    public int intage_i = 18;
    public int currentprogress_i;
    public String intprogress_i = "0";
    public String typeofuser_i = "0";
    public String weight2_i = "60";
    public String age2_i = "18";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimintermediate);

        back = (Button) findViewById(R.id.bmibackbutton_intermediate);
        calculate = (Button) findViewById(R.id.calculatebmi_intermediate);

        currentheight_i = (TextView) findViewById(R.id.currentheight_intermediate);
        currentage_i = (TextView) findViewById(R.id.currentage_intermediate);
        currentweight_i = (TextView) findViewById(R.id.currentweight_intermediate);
        incrementage_i = (ImageView) findViewById(R.id.incrementage_intermediate);
        incrementweight_i = (ImageView) findViewById(R.id.incrementweight_intermediate);
        decrementage_i = (ImageView) findViewById(R.id.decrementage_intermediate);
        decrementweight_i = (ImageView) findViewById(R.id.decrementweight_intermediate);
        seekbarheight_i = (SeekBar) findViewById(R.id.seekbarforheight_intermediate);
        male_i = (RelativeLayout) findViewById(R.id.male_intermediate);
        female_i = (RelativeLayout) findViewById(R.id.female_intermediate);

        male_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                male_i.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.malefemalefocus_intermedaite));
                female_i.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.malefemalenotfocused_intermediate));
                typeofuser_i = "Male";
            }
        });

        female_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                female_i.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.malefemalefocus_intermedaite));
                male_i.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.malefemalenotfocused_intermediate));
                typeofuser_i = "Female";
            }
        });

        seekbarheight_i.setMax(300);
        seekbarheight_i.setProgress(0);

        seekbarheight_i.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                currentprogress_i = progress;
                intprogress_i = String.valueOf(currentprogress_i);
                currentheight_i.setText(intprogress_i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        incrementage_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intage_i = intage_i + 1;
                age2_i = String.valueOf(intage_i);
                currentage_i.setText(age2_i);
            }
        });

        incrementweight_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intweight_i = intweight_i + 1;
                weight2_i = String.valueOf(intweight_i);
                currentweight_i.setText(weight2_i);
            }
        });

        decrementweight_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intweight_i = intweight_i - 1;
                weight2_i = String.valueOf(intweight_i);
                currentweight_i.setText(weight2_i);
            }
        });

        decrementage_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intage_i = intage_i - 1;
                age2_i = String.valueOf(intage_i);
                currentage_i.setText(age2_i);
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntermediateProfileActivity.class);
                startActivity(intent);
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (typeofuser_i.equals("0")) {
                    Toast.makeText(getApplicationContext(), "Select your Gender", Toast.LENGTH_SHORT).show();
                } else if (intprogress_i.equals("0")) {

                    Toast.makeText(getApplicationContext(), "Select your Height", Toast.LENGTH_SHORT).show();
                } else if (intage_i == 0 || intage_i < 0) {

                    Toast.makeText(getApplicationContext(), "Age incorrect", Toast.LENGTH_SHORT).show();
                } else if (intweight_i == 0 || intweight_i < 0) {

                    Toast.makeText(getApplicationContext(), "Weight incorrect", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(getApplicationContext(), BIMCalculatorIntermediateActivity.class);


                    intent.putExtra("gender_intermediate", typeofuser_i);
                    intent.putExtra("height_intermediate", intprogress_i);
                    intent.putExtra("weight_intermediate", weight2_i);
                    intent.putExtra("age_intermediate", age2_i);


                    startActivity(intent);
                }


            }
        });


    }
}