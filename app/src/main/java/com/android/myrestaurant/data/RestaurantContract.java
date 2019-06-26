package com.android.myrestaurant.data;

import android.provider.BaseColumns;

public final class RestaurantContract {

    public RestaurantContract() { }

    public static abstract class SoupEntry implements BaseColumns{

        public static final String TABLE_NAME = "soup";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_SOUP_NAME = "name";
        public static final String COLUMN_SOUP_PRICE = "price";
        public static final String COLUMN_SOUP_IMAGE = "image";
    }

    public static abstract class PastaEntry implements BaseColumns{

        public static final String TABLE_NAME = "pasta";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PASTA_NAME = "name";
        public static final String COLUMN_PASTA_PRICE = "price";
        public static final String COLUMN_PASTA_IMAGE = "image";
    }

    public static abstract class PizzaEntry implements BaseColumns{

        public static final String TABLE_NAME = "pizza";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PIZZA_NAME = "name";
        public static final String COLUMN_PIZZA_PRICE = "price";
        public static final String COLUMN_PIZZA_IMAGE = "image";
    }
}
