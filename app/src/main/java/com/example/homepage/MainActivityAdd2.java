package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityAdd2 extends AppCompatActivity {

    EditText EditTextCatogaryType , EditTextBakeryItem;
    Button ButtonAdd , ButtonBackToCatogaryMenu;

    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_add2);
        dbHelper = new DBHelper(this);
        dbHelper.OpenDB();
        EditTextCatogaryType = (EditText) findViewById(R.id.txtCatogaryType);
        EditTextBakeryItem = (EditText) findViewById(R.id.txtBakeryItem);
        ButtonAdd = (Button) findViewById(R.id.btnAdd1);
        ButtonBackToCatogaryMenu = (Button) findViewById(R.id.btnBackToCatogaryMenu);
        ButtonBackToCatogaryMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentActivityMainManageCatogary = new Intent(MainActivityAdd2.this,MainActivityManageCatogary.class);
                startActivity(IntentActivityMainManageCatogary);
            }
        });
    }
}