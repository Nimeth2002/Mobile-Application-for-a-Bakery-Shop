package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdminPanel extends AppCompatActivity {

    TextView TextViewSprinklesBakery , TextViewAdminPanel;
    Button ButtonCreateNewCategories , ButtonManageCategories , ButtonCreateNewCupcakes , ButtonViewOrders , ButtonManageCupcakes , ButtonProcessOrders ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        TextViewSprinklesBakery = (TextView) findViewById(R.id.txtSprinklesBakery6);
        TextViewAdminPanel = (TextView) findViewById(R.id.txtAdminPanel);
        ButtonCreateNewCategories = (Button) findViewById(R.id.btnCatogaries);
        ButtonCreateNewCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityCatogary2 = new Intent(AdminPanel.this,MainActivityCatogary2.class);
                startActivity(InterMainActivityCatogary2);
            }
        });
        ButtonManageCategories = (Button) findViewById(R.id.btnManageCatogaries);
        ButtonManageCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityManageCatogary = new Intent(AdminPanel.this,MainActivityManageCatogary.class);
                startActivity(InterMainActivityManageCatogary);
            }
        });
        ButtonCreateNewCupcakes = (Button) findViewById(R.id.btnCreateNewCupcakes);
        ButtonCreateNewCupcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityCreateCupcakes = new Intent(AdminPanel.this,MainActivityCreateCupcakes2.class);
                startActivity(InterMainActivityCreateCupcakes);
            }
        });
        ButtonViewOrders = (Button) findViewById(R.id.btnViewOrders);
        ButtonViewOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityViewOrders2 = new Intent(AdminPanel.this,MainActivityViewOrders2.class);
                startActivity(InterMainActivityViewOrders2);
            }
        });
        ButtonManageCupcakes = (Button) findViewById(R.id.btnManageCupcakes);
        ButtonManageCupcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityManageCupcakes2 = new Intent(AdminPanel.this,MainActivityManageCupcakes2.class);
                startActivity(InterMainActivityManageCupcakes2);
            }
        });
        ButtonProcessOrders = (Button) findViewById(R.id.btnProcessOrders);
        ButtonProcessOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityProcessOrders2 = new Intent(AdminPanel.this,MainActivityProcessOrders2.class);
                startActivity(InterMainActivityProcessOrders2);
            }
        });




    }
}