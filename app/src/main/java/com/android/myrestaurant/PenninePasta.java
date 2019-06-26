package com.android.myrestaurant;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PenninePasta extends AppCompatActivity {

    ImageView imgview;
    TextView pastaName, pastaPrice, halfPrice, price;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soup_details);

        Toolbar toolbar = findViewById(R.id.toolbar_soup);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.prawn_soup);

        pastaName = findViewById(R.id.delicacyName);
        pastaName.setText(R.string.pennine_pasta);

        imgview = findViewById(R.id.imageView);
        imgview.setImageResource(R.drawable.pasta);

        price = findViewById(R.id.prices);
        price.setText(R.string.pennine_pasta_price);

        pastaPrice = findViewById(R.id.price_full);
        pastaPrice.setText(R.string.pennine_pasta_price);

        halfPrice = findViewById(R.id.price_half);
        halfPrice.setText(R.string.pennine_half_price);
    }
}
