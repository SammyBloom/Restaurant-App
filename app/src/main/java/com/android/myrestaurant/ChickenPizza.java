package com.android.myrestaurant;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ChickenPizza extends AppCompatActivity {

    ImageView chickImg;
    TextView chickName, chickPrice, chickHalf_price, chickFullPrice;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soup_details);

        Toolbar toolbar = findViewById(R.id.toolbar_soup);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.chicken_pizza);

        chickName = findViewById(R.id.delicacyName);
        chickName.setText(R.string.chicken_pizza);

        chickImg = findViewById(R.id.imageView);
        chickImg.setImageResource(R.drawable.chicken_pizza);

        chickPrice = findViewById(R.id.prices);
        chickPrice.setText(R.string.chicken_pizza_price);

        chickFullPrice = findViewById(R.id.price_full);
        chickFullPrice.setText(R.string.chicken_pizza_price);

        chickHalf_price = findViewById(R.id.price_half);
        chickHalf_price.setText(R.string.chicken_half_price);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
