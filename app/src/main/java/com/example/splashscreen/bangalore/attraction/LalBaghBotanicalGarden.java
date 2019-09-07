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

public class LalBaghBotanicalGarden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lal_bagh_botanical_garden);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.lal_bagh_botanical_garden_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Lalbagh-Botanical-Garden-in-Bangalore-PP-Yoonus-wikimedia.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_lal_bagh_botanical_garden);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.950743, 77.584777?q=Lalbagh Botanical Garden, Mavalli, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}