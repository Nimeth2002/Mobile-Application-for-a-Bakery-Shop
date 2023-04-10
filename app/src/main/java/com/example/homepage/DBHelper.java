package com.example.homepage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper
{
    private Context con;
    private SQLiteDatabase db;

    public DBHelper(Context con)
    {
        this.con = con;

    }
    public DBHelper OpenDB()
    {
        DBConnector dbCon =new DBConnector(con);
        db = dbCon.getWritableDatabase();
        return this;
    }

}
