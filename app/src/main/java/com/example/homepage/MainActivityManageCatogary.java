package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityManageCatogary extends AppCompatActivity {
    Button ButtonAdd , ButtonRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_manage_catogary);
        ButtonAdd = (Button) findViewById(R.id.btnAdd);
        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityAdd2 = new Intent(MainActivityManageCatogary.this,MainActivityAdd2.class);
                startActivity(InterMainActivityAdd2);
            }
        });
        ButtonRemove = (Button) findViewById(R.id.btnRemove);
        ButtonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityRemove2 = new Intent(MainActivityManageCatogary.this,MainActivityRemove2.class);
                startActivity(InterMainActivityRemove2);
            }
        });

    }
}