package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RememberActivity extends AppCompatActivity {

    EditText username;
    Button reset;
    DBHelper yourpersonaltrainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);

        backButton();
        resetPassword();
    }

    public void backButton(){
        Button backbutton = (Button) findViewById(R.id.resetpasswordbackbtn);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void resetPassword(){

        username = (EditText) findViewById(R.id.rememberusername);
        reset = (Button) findViewById(R.id.resetpasswordbtn);
        yourpersonaltrainer = new DBHelper(this);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                Boolean checkuser = yourpersonaltrainer.checkUsername(user);
                if(checkuser == true){

                    Intent intent = new Intent(getApplicationContext(),ResetActivity.class);
                    intent.putExtra("username",user);
                    startActivity(intent);
                }else{
                    Toast.makeText(RememberActivity.this,"User does not exists.",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}