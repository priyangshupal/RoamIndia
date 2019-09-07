package com.example.splashscreen.bangalore.attraction;

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

public class CubbonPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubbon_park);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.cubbon_park_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Cubbon-Park-Samuel-Jacob-Flickr-Creative-commons.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_cubbon_park);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.976901, 77.594248?q=Cubbon Park, Sampangi Rama Nagara, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}