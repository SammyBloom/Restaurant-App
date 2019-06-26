package com.android.myrestaurant;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SoupDetails extends AppCompatActivity {

    TextView normalSoup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soup_details);

        Toolbar toolbar = findViewById(R.id.toolbar_soup);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.normal_soup);

        normalSoup = findViewById(R.id.delicacyName);
        normalSoup.setText(R.string.normal_soup);
    }
}
