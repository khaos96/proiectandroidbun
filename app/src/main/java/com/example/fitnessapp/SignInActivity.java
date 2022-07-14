package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {

    private static final String FILE_NAME = "myFile";
    private EditText usernameLogin,passwordLogin;
    private Button btnLogin;
    private CheckBox remember;
     TextView reset;


    DBHelper yourpersonaltrainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        try{
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        configureSignUpButton();
        resetPassword();
        showPassword();
        Login();

        reset = (TextView) findViewById(R.id.forgotpassword);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view )
            {
                startActivity(new Intent(SignInActivity.this, RememberActivity.class));
            }

        });

    }
    public void configureSignUpButton(){

        Button signupButton = (Button) findViewById(R.id.signupinbtn);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view )
            {
                startActivity(new Intent(SignInActivity.this, SignupActivity.class));
            }

        });
    }


        public void showPassword(){

            EditText password;
            CheckBox showpassword;

            showpassword = (CheckBox) findViewById(R.id.checkbox);
            password = (EditText) findViewById(R.id.password);

            showpassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                    if(isChecked){

                        password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

                    }else{

                        password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                }
            });

        }

        public void Login(){

            usernameLogin = (EditText) findViewById(R.id.username);
            passwordLogin = (EditText) findViewById(R.id.password);
            btnLogin = (Button) findViewById(R.id.loginbtn);
            remember = (CheckBox) findViewById(R.id.rememberme);

            SharedPreferences sharedPreferences = getSharedPreferences(FILE_NAME,MODE_PRIVATE);
            String user = sharedPreferences.getString("username","");
            String pass = sharedPreferences.getString("password","");

            usernameLogin.setText(user);
            passwordLogin.setText(pass);



            yourpersonaltrainer = new DBHelper(this);
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String user = usernameLogin.getText().toString();
                    String pass = passwordLogin.getText().toString();
                    String name = usernameLogin.getText().toString();
                    if(remember.isChecked()){

                        StoredData(user,pass);
                    }

                    if(user.equals("") || pass.equals("")){

                        Toast.makeText(SignInActivity.this,"Please eneter the credentials!",Toast.LENGTH_SHORT).show();

                    }
                    else{

                        Boolean result = yourpersonaltrainer.checkUsernamePassword(user,pass);
                        if (result == true) {

                            Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                            intent.putExtra("Name",name);
                            startActivity(intent);
                        }
                        else{

                            Toast.makeText(SignInActivity.this,"Invalid credentials!",Toast.LENGTH_SHORT).show();

                        }

                    }
                }
            });
        }

        public void StoredData(String usernameLogin, String passwordLogin){

            SharedPreferences.Editor editor = getSharedPreferences(FILE_NAME,MODE_PRIVATE).edit();
            editor.putString("username",usernameLogin);
            editor.putString("password",passwordLogin);
            editor.apply();

    }

        public void resetPassword(){
            TextView reset = (TextView) findViewById(R.id.forgotpassword);
            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view )
                {
                    Intent intent = new Intent(getApplicationContext(), ExercisesActivity.class);
                    startActivity(intent);
                }

            });

        }


}