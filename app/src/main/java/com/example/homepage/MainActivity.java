package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TextViewSprinklesBakery ;
    Button ButtonLogin;
    Button ButtonRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextViewSprinklesBakery = (TextView) findViewById(R.id.txtSprinklesBakery1);
        ButtonLogin = (Button) findViewById(R.id.btnLogin);
        ButtonLogin .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivity2Login = new Intent(MainActivity.this,MainActivity2Login.class);
                startActivity(InterMainActivity2Login);
            }
        });
        ButtonRegistration = (Button) findViewById(R.id.btnRegistration);
        ButtonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivity3Registration = new Intent(MainActivity.this,MainActivity3Registration.class);
                startActivity(InterMainActivity3Registration);
            }
        });



    }
}