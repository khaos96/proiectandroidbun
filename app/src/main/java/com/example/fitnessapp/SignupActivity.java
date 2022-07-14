package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText name,email,username,password,repassword;
    Button btnRegister;
    DBHelper yourpersonaltrainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        configurebacktologinButton();
        configureRegistration();

    }

    private void configurebacktologinButton(){
        Button backButton = (Button) findViewById(R.id.signupbackbtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void configureRegistration(){

       username = (EditText) findViewById(R.id.registerusername);
        name = (EditText) findViewById(R.id.name);
       email = (EditText) findViewById(R.id.mail);
        password = (EditText) findViewById(R.id.registerpassword);
        repassword = (EditText) findViewById(R.id.repeatpassword);

        btnRegister = (Button) findViewById(R.id.regiserbtn);

        yourpersonaltrainer = new DBHelper(this);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String fullname = name.getText().toString();
                String mail = email.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if(user.equals("") || fullname.equals("") || mail.equals("") || pass.equals("") || repass.equals("")){

                    Toast.makeText(SignupActivity.this,"Fill all the fields!",Toast.LENGTH_SHORT).show();
                }
                else{

                    if(pass.equals(repass)){

                      Boolean usercheckResult =  yourpersonaltrainer.checkUsername(user);
                        if(usercheckResult == false){

                            Boolean regResult = yourpersonaltrainer.insertData(fullname,mail,user,pass);
                            if(regResult == true){

                                Toast.makeText(SignupActivity.this,"Registration successful!",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),SignInActivity.class);
                                startActivity(intent);
                            }
                            else{

                                Toast.makeText(SignupActivity.this,"Registration failed!",Toast.LENGTH_SHORT).show();

                            }
                        }
                        else{
                            Toast.makeText(SignupActivity.this,"User alerdy exists! \n Please sign in.",Toast.LENGTH_SHORT).show();

                        }
                    }
                    else{

                        Toast.makeText(SignupActivity.this,"Password not matching!",Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }

}