package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2Login extends AppCompatActivity {

    TextView TextViewSprinklesBakery , TextViewUserLevel;
    Button ButtonAdmin , ButtonMember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_login);

        TextViewSprinklesBakery = (TextView) findViewById(R.id.txtSprinklesBakery3);
        TextViewUserLevel = (TextView) findViewById(R.id.txtUserLevel);
        ButtonAdmin = (Button) findViewById(R.id.btnAdmin);
        ButtonAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityLogin3 = new Intent(MainActivity2Login.this,MainActivityLogin3.class);
                startActivity(InterMainActivityLogin3);
            }
        });
        ButtonMember = (Button) findViewById(R.id.btnMember);
        ButtonMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityMember = new Intent(MainActivity2Login.this,MainActivityMember.class);
                startActivity(InterMainActivityMember);
            }
        });


    }
}