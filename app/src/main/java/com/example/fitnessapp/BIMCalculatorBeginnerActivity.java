package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BIMCalculatorBeginnerActivity extends AppCompatActivity {

    Button recalculate, backbtn;

    TextView  bmicategory, gender;
    Intent intent;
    ImageView imageview;
    String bmi;
    float intbmi;

    String height;
    String weight;

    float intheight, intweight;
    RelativeLayout background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimcalculator_beginner);


        intent = getIntent();
        bmicategory = (TextView) findViewById(R.id.bmicategory);
        gender = (TextView) findViewById(R.id.genderdisplay);
        background = (RelativeLayout) findViewById(R.id.contentLayout);
        imageview = (ImageView) findViewById(R.id.imageview);
        recalculate = (Button) findViewById(R.id.recalculatebmi_beginner);


        height = intent.getStringExtra("height");
        weight = intent.getStringExtra("weight");

        intheight = Float.parseFloat(height);
        intweight = Float.parseFloat(weight);

        intheight = intheight / 100;
        intbmi = intweight / (intheight * intheight);
        bmi = Float.toString(intbmi);


        if (intbmi < 16) {
            bmicategory.setText("Severe Thinness");
            background.setBackgroundColor(Color.RED);
            imageview.setImageResource(R.drawable.cross_good);
        } else if (intbmi < 16.9 && intbmi > 16) {

            bmicategory.setText("Moderate Thinness");
            background.setBackgroundColor(Color.RED);
            imageview.setImageResource(R.drawable.warning_good);
        } else if (intbmi < 18.4 && intbmi > 17) {

            bmicategory.setText("Mild Thinness");
            background.setBackgroundColor(Color.RED);
            imageview.setImageResource(R.drawable.warning_good);
        } else if (intbmi < 25 && intbmi > 18.4) {

            bmicategory.setText("Normal");
            background.setBackgroundColor(Color.GREEN);
            imageview.setImageResource(R.drawable.ok_good);
        } else if (intbmi < 29.4 && intbmi > 25) {

            bmicategory.setText("Overweight");
            background.setBackgroundColor(Color.YELLOW);
            imageview.setImageResource(R.drawable.warning_good);
        } else {
            bmicategory.setText("Obese Class I");
            background.setBackgroundColor(Color.RED);
            imageview.setImageResource(R.drawable.cross_good);
        }

        gender.setText(intent.getStringExtra("gender"));



        recalculate = (Button) findViewById(R.id.recalculatebmi_beginner);
        backbtn = (Button) findViewById(R.id.recalculatebmi_back_beginner);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BIMCalculatorBeginnerActivity.this, ExercisesProfileActivity.class);
                startActivity(intent);
            }
        });
        recalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BIMCalculatorBeginnerActivity.this, BIMBeginnerActivity.class);
                startActivity(intent);
            }
        });


    }
}