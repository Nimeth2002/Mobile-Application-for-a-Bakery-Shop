package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Syccuss extends AppCompatActivity {
    TextView TextViewSprinklesBakery , TextViewSuccessRegister , TextViewCopyright;
    Button ButtonBackToMainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syccuss);

        TextViewSprinklesBakery = (TextView) findViewById(R.id.txtSprinklesBakery2);
        TextViewSuccessRegister = (TextView) findViewById(R.id.txtSuccessRegister);
        TextViewCopyright = (TextView) findViewById(R.id.textCopyright2);
        ButtonBackToMainPage = (Button) findViewById (R.id.btnMain);
        ButtonBackToMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent InterMainActivity = new Intent(Syccuss.this,MainActivity.class);
                startActivity(InterMainActivity);
            }
        });
    }
}