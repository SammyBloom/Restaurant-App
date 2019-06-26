package com.android.myrestaurant;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PepperoniPizza extends AppCompatActivity {

    ImageView pepImg;
    TextView pepName, pepPrice, pepHalf_price, pepFullPrice;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soup_details);

        Toolbar toolbar = findViewById(R.id.toolbar_soup);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.pepperoni_pizza);

        pepName = findViewById(R.id.delicacyName);
        pepName.setText(R.string.pepperoni_pizza);

        pepImg = findViewById(R.id.imageView);
        pepImg.setImageResource(R.drawable.pasta);

        pepPrice = findViewById(R.id.prices);
        pepPrice.setText(R.string.pepperoni_pizza_price);

        pepFullPrice = findViewById(R.id.price_full);
        pepFullPrice.setText(R.string.pepperoni_pizza_price);

        pepHalf_price = findViewById(R.id.price_half);
        pepHalf_price.setText(R.string.pepperoni_half_price);
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
