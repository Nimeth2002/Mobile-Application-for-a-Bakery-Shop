package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityCreateCupcakes2 extends AppCompatActivity {
    EditText EditTextMake , EditTextModel , EditTextIcing , EditTextDecoration;
    Button ButtonAddCupcake , ButtonBackToCupcakeMenu;

    private DBHelper2 dbHelper2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_create_cupcakes2);
        dbHelper2 = new DBHelper2(this);
        dbHelper2.OpenDB();
        EditTextMake = (EditText) findViewById(R.id.txtMake);
        EditTextModel = (EditText) findViewById(R.id.txtModel);
        EditTextIcing = (EditText) findViewById(R.id.txtIcing);
        EditTextDecoration = (EditText) findViewById(R.id.txtDecoration);
        ButtonAddCupcake = (Button) findViewById(R.id.btnCupcake);
        ButtonBackToCupcakeMenu = (Button) findViewById(R.id.btnCupcakesMenu);
        ButtonBackToCupcakeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivityManageCupcakes2 = new Intent(MainActivityCreateCupcakes2.this,MainActivityManageCupcakes2.class);
                startActivity(InterMainActivityManageCupcakes2);
            }
        });
    }
}