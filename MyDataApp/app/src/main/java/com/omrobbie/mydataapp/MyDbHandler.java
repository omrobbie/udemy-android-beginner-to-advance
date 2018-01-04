package com.omrobbie.mydataapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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

    public MyDbHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
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

    public void addProduct(Products products) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_PRODUCT_NAME, products.get_productName());

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.insert(TABLE_PRODUCT, null, values);
        sqLiteDatabase.close();
    }

    public void deleteProduct(String product_name) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("DELETE FROM " + TABLE_PRODUCT +
                " WHERE " + COLUMN_PRODUCT_NAME + " =\"" + product_name + "\";"
        );
    }

    public String databaseToString() {
        String dbString = "";

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();

        String query = "SELECT * FROM " + TABLE_PRODUCT;
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            if (cursor.getString(cursor.getColumnIndex(COLUMN_PRODUCT_NAME)) != null) {
                dbString += cursor.getString(cursor.getColumnIndex(COLUMN_PRODUCT_NAME));
                dbString += "\n";
            }
            cursor.moveToNext();
        }
        cursor.close();
        sqLiteDatabase.close();

        return dbString;
    }
}
