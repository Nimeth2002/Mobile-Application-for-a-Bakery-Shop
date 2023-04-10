package com.example.homepage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBConnector2 extends SQLiteOpenHelper
{

    public DBConnector2(@Nullable Context context) {
        super(context,"Sprinkles Bakery", null,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        sqLiteDatabase.execSQL("Create Table Cupcakes_Info(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,Make  VARCHSR,Model VARCHAR,Icing VARCHAR,Decoration VARCHAR )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
