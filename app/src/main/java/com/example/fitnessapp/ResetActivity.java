package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResetActivity extends AppCompatActivity {

        TextView username;
        EditText resetpass,reresetpass;
        Button confirm;

        DBHelper yourpersonaltrainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        username = (TextView) findViewById(R.id.showusername);
        resetpass = (EditText) findViewById(R.id.passwordreset);
        reresetpass = (EditText) findViewById(R.id.repasswordreset);
        confirm = (Button) findViewById(R.id.confirmbtn);
        DBHelper yourpersonaltrainer = new DBHelper(this);

        Intent intent = getIntent();
        username.setText(intent.getStringExtra("username"));

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String repass = reresetpass.getText().toString();
                String pass = resetpass.getText().toString();

                if(pass.equals(repass)) {


                    Boolean checkpasswordupdate = yourpersonaltrainer.updatepassword(user, pass);
                    if (checkpasswordupdate == false) {

                        Intent intent = new Intent(getApplicationContext(), SignInActivity.class);
                        startActivity(intent);
                        Toast.makeText(ResetActivity.this, "Password updated successfully.", Toast.LENGTH_SHORT).show();

                    } else {

                        Toast.makeText(ResetActivity.this, "Password not updated successfully.", Toast.LENGTH_SHORT).show();

                    }
                }else{

                    Toast.makeText(ResetActivity.this, "Password not matching.", Toast.LENGTH_SHORT).show();

                }
            }
        });



    }
}