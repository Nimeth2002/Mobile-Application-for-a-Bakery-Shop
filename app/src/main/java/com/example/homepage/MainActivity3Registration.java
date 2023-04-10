package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3Registration extends AppCompatActivity {
    TextView TextViewSprinklesBakery , TextViewCreateANewAccount;
    EditText EditTextFirstName , EditTextLastName,EditTextEmail,EditTextPassword,EditTextConfirmPassword;
    Button ButtonRegistration , ButtonBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_registration);
        TextViewSprinklesBakery = (TextView) findViewById(R.id.txtSprinklesBakery1);
        TextViewCreateANewAccount = (TextView) findViewById(R.id.txtCreateAccount);
        EditTextFirstName = (EditText) findViewById(R.id.txtFirstName);
        EditTextLastName = (EditText) findViewById(R.id.txtLastName);
        EditTextEmail = (EditText) findViewById(R.id.txtEmail);
        EditTextPassword = (EditText) findViewById(R.id.txtPassword);
        EditTextConfirmPassword = (EditText) findViewById(R.id.txtConfirmPassword);
        ButtonRegistration =(Button) findViewById(R.id.btnRegistration);
        ButtonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivity3Registration  = new Intent(MainActivity3Registration.this,Syccuss.class);
                startActivity(InterMainActivity3Registration);
            }
        });
        ButtonBackToLogin = (Button) findViewById(R.id.btnBacktoLogin);
        ButtonBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivity3Registration = new Intent(MainActivity3Registration.this,MainActivity.class);
                startActivity(InterMainActivity3Registration);
            }
        });
    }
}