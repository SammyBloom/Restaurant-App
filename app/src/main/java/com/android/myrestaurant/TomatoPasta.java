package com.android.myrestaurant;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class TomatoPasta extends AppCompatActivity {

    ImageView imgView;
    TextView pastaName, price, pastaPrice, halfPrice;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soup_details);

        Toolbar toolbar = findViewById(R.id.toolbar_soup);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.tomato_pasta);

        pastaName = findViewById(R.id.delicacyName);
        pastaName.setText(R.string.tomato_pasta);

        imgView = findViewById(R.id.imageView);
        imgView.setImageResource(R.drawable.tomato_pasta);

        price = findViewById(R.id.prices);
        price.setText(R.string.tomato_pasta_price);

        pastaPrice = findViewById(R.id.price_full);
        pastaPrice.setText(R.string.tomato_pasta_price);

        halfPrice = findViewById(R.id.price_half);
        halfPrice.setText(R.string.tomato_half_price);
    }
}
