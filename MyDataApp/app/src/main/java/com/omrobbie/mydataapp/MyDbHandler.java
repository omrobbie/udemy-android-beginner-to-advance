package com.omrobbie.mydataapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by omrobbie on 05/01/2018.
 */

public class MyDbHandler extends SQLiteOpenHelper {

    public static final String TABLE_PRODUCT = "products";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_PRODUCT_NAME = "product_name";

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "products.db";

    public MyDbHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + TABLE_PRODUCT + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_PRODUCT_NAME + " TEXT);";

        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCT);
        onCreate(sqLiteDatabase);
    }
}
