package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityManageCupcakes2 extends AppCompatActivity {
    Button ButtonAdd , ButtonRemove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_manage_cupcakes2);
        ButtonAdd = (Button) findViewById(R.id.btnAdd1);
        ButtonAdd .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentMainActivityCreateCupcakes2 = new Intent(MainActivityManageCupcakes2.this,MainActivityCreateCupcakes2.class);
                startActivity(IntentMainActivityCreateCupcakes2);
            }
        });
        ButtonRemove = (Button) findViewById(R.id.btnRemove1);
        ButtonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentMainActivityDeleteCupcakes2 = new Intent(MainActivityManageCupcakes2.this,MainActivityDeleteCupcakes2.class);
                startActivity(IntentMainActivityDeleteCupcakes2);
            }
        });
    }
}