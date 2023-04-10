package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MemberPanel extends AppCompatActivity {
    TextView TextViewSprinklesBakery , TextViewMemberPanel;
    Button ButtonCreateAccount , ButtonViewCupcakes , ButtonOrderCupcakes , ButtonViewOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_panel);
        TextViewSprinklesBakery = (TextView) findViewById(R.id.txtSprinklesBakery10);
        TextViewMemberPanel = (TextView) findViewById(R.id.txtMemberPanel);
        ButtonCreateAccount = (Button) findViewById(R.id.btnCreateAccount);
        ButtonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivity3Registration = new Intent(MemberPanel.this,MainActivity3Registration.class);
                startActivity(InterMainActivity3Registration);
            }
        });
        ButtonViewCupcakes = (Button) findViewById(R.id.btnViewCupcakes1);
        ButtonViewCupcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterViewCupcakes = new Intent(MemberPanel.this,ViewCupcakes.class);
                startActivity(InterViewCupcakes);
            }
        });
        ButtonOrderCupcakes = (Button) findViewById(R.id.btnOrderCupcakes);
        ButtonOrderCupcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterOrderCupcakes = new Intent(MemberPanel.this,OrderCupcakes.class);
                startActivity(InterOrderCupcakes);
            }
        });
        ButtonViewOrder = (Button) findViewById(R.id.btnViewOrder);
        ButtonViewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityViewOrders2 = new Intent(MemberPanel.this,MainActivityViewOrders2.class);
                startActivity(InterMainActivityViewOrders2);
            }
        });
    }
}