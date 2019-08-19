package com.destiny.motoraksesoris.SharedPreferance;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_Helper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "aksesorimotor.db";
    private static final int DATABASE_VERSION = 3;
    public static final String TABLE_NAME = "user";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_NAMA = "nama";

    public DB_Helper(Context context){super(
            context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+TABLE_NAME+" (" +
                COLUMN_EMAIL+" TEXT NOT NULL, "+
                COLUMN_PASSWORD+" TEXT NOT NULL, "+
                COLUMN_NAMA+" TEXT NOT NULL);"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        this.onCreate(db);
    }

    public void saveUser(User user){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_EMAIL, user.getEmail());
        values.put(COLUMN_PASSWORD,user.getPassword());
        values.put(COLUMN_NAMA,user.getNama());

        db.insert(TABLE_NAME,null,values);
        db.close();
    }
    
    public Cursor checkUser(String email,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        String query ="SELECT * FROM "+TABLE_NAME+" WHERE "+COLUMN_EMAIL+" = '"+email+"' AND "+COLUMN_PASSWORD+" = '"+password+"'";
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
    public Cursor checkUser(String email){
        SQLiteDatabase db = this.getWritableDatabase();
        String query ="SELECT * FROM "+TABLE_NAME+" WHERE "+COLUMN_EMAIL+" = '"+email+"'";
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }

}

