package com.example.homepage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBConnector extends SQLiteOpenHelper
{
    public  DBConnector (Context context)
    {
        super(context,"Sprinkles Bakery", null,1  );


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("Create Table Catogary_Info(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,CAtogary_Type VARCHSR,Bakery_Item VARCHAR )");
        sqLiteDatabase.execSQL("Create Table Order_Info(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,FUll_name VARCHSR,Email VARCHAR,Size_int,flavor_Varchar )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }


}
