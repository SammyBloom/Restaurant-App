package com.android.myrestaurant.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class RestaurantDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Restaurant.db";

    public RestaurantDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_SOUP_TABLE = "CREATE TABLE " + RestaurantContract.SoupEntry.TABLE_NAME + "("
                + RestaurantContract.SoupEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + RestaurantContract.SoupEntry.COLUMN_SOUP_NAME + " TEXT NOT NULL, "
                + RestaurantContract.SoupEntry.COLUMN_SOUP_PRICE + " INTEGER, "
                + RestaurantContract.SoupEntry.COLUMN_SOUP_IMAGE + " TEXT );";

        sqLiteDatabase.execSQL(SQL_CREATE_SOUP_TABLE);

        String SQL_CREATE_PASTA_TABLE = "CREATE TABLE " + RestaurantContract.PastaEntry.TABLE_NAME + "("
                + RestaurantContract.PastaEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + RestaurantContract.PastaEntry.COLUMN_PASTA_NAME + " TEXT NOT NULL, "
                + RestaurantContract.PastaEntry.COLUMN_PASTA_PRICE + " INTEGER, "
                + RestaurantContract.PastaEntry.COLUMN_PASTA_IMAGE + " TEXT );";

        sqLiteDatabase.execSQL(SQL_CREATE_PASTA_TABLE);

        String SQL_CREATE_PIZZA_TABLE = "CREATE TABLE " + RestaurantContract.PizzaEntry.TABLE_NAME + "("
                + RestaurantContract.PizzaEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + RestaurantContract.PizzaEntry.COLUMN_PIZZA_NAME + " TEXT NOT NULL, "
                + RestaurantContract.PizzaEntry.COLUMN_PIZZA_PRICE + " INTEGER, "
                + RestaurantContract.PizzaEntry.COLUMN_PIZZA_IMAGE + " TEXT );";

        sqLiteDatabase.execSQL(SQL_CREATE_PIZZA_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
