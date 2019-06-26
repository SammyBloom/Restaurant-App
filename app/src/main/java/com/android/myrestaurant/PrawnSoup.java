package com.android.myrestaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class PrawnSoup extends AppCompatActivity {

    ImageView soupImg;
    TextView soupPrice_full, soupPrice_half, prawnSoup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soup_details);

        Toolbar toolbar = findViewById(R.id.toolbar_soup);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.prawn_soup);

        prawnSoup = findViewById(R.id.delicacyName);
        prawnSoup.setText(R.string.prawn_soup);

        soupImg = findViewById(R.id.imageView);
        soupImg.setImageResource(R.drawable.prawn_coconut_soup);

        soupPrice_full = findViewById(R.id.price_full);
        soupPrice_full.setText(R.string.prawn_soup_fullPrice);

        soupPrice_half = findViewById(R.id.price_half);
        soupPrice_half.setText(R.string.prawn_soup_halfPrice);
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
