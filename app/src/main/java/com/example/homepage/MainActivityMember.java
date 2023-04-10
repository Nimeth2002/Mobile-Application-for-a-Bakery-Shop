package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityMember extends AppCompatActivity {

    TextView TextViewSprinklesBakery5, TextViewLogin1;
    EditText EditTextUsername , EditTextPassword;
    Button ButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_member);

        TextViewSprinklesBakery5 = (TextView) findViewById(R.id.txtSprinklesBakery5);
        TextViewLogin1 = (TextView) findViewById(R.id.txtLogin1);
        EditTextUsername = (EditText) findViewById(R.id.txtUsername1);
        EditTextPassword = (EditText) findViewById(R.id.txtPassword1);
        ButtonLogin = (Button) findViewById(R.id.btnLogin3);
        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(EditTextUsername.getText().toString().isEmpty()||EditTextPassword.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Field cant be blanked",Toast.LENGTH_LONG).show();
                }
                else if(EditTextUsername.getText().toString().equals("Member")&&EditTextPassword.getText().toString().equals("1234"))
                {
                    Toast.makeText(getApplicationContext(),"Welcome Member ",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Login",Toast.LENGTH_LONG).show();
                }

            }
        });
           ButtonLogin.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent InterMainActivityMember = new Intent(MainActivityMember.this,MainActivityMember.class);
                   startActivity(InterMainActivityMember);
               }



           });

    }
}