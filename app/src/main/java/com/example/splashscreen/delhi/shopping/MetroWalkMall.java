package com.example.splashscreen.delhi.shopping;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.splashscreen.DownloadImageFromInternet;
import com.example.splashscreen.R;

public class MetroWalkMall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro_walk_mall);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.metro_walk_mall_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Shopping-Metro-Walk-Mall-delhi.jpg");


        FloatingActionButton fab = findViewById(R.id.fab_metro_walk_mall);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:28.389599, 77.297320?q=Metro Mall Faridabad, Metro Road, Narela Rajeev Nagar, Frontier Colony, New Industrial Town, Faridabad, Haryana"));
                startActivity(intent);
            }
        });
    }
}
