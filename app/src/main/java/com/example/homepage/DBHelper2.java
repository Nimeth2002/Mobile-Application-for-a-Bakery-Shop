package com.example.homepage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper2
{
    private Context con;
    private SQLiteDatabase db;

    public DBHelper2(Context con)
    {
        this.con = con;

    }
    public DBHelper2 OpenDB()
    {
        DBConnector2 dbCon =new DBConnector2(con);
        db = dbCon.getWritableDatabase();
        return this;

    }
}

