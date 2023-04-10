package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityLogin3 extends AppCompatActivity {
     TextView TextViewSprinklesBakery , TextViewLogin;
     EditText EditTextUsername , EditTextPassword;
     Button ButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login3);

        TextViewSprinklesBakery = (TextView) findViewById(R.id.txtSprinklesBakery4);
        TextViewLogin = (TextView) findViewById(R.id.txtLogin);
        EditTextUsername = (EditText) findViewById(R.id.txtUsername);
        EditTextPassword = (EditText) findViewById(R.id.txtPassword);
        ButtonLogin = (Button) findViewById(R.id.btnLogin);
        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(EditTextUsername.getText().toString().isEmpty()||EditTextPassword.getText().toString().isEmpty())
                {
                    Toast .makeText(getApplicationContext(),"Field cant be blanked",Toast.LENGTH_LONG).show();
                }
                else if(EditTextUsername.getText().toString().equals("Admin")&&EditTextPassword.getText().toString().equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"Welcome Admin",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Login",Toast.LENGTH_LONG).show();
                }
            }
        });
        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterAdminPanel = new Intent(MainActivityLogin3.this,AdminPanel.class);
                startActivity(InterAdminPanel);
            }
        });
    }
}