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

public class VisvesvarayaIndustrialTechnologicalMuseum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visvesvaraya_industrial_technological_museum);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.visvesvaraya_industrial_technological_museum_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Vidhana-Soudha-and-Attara-Kacheri-in-Bangalore_0.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_visvesvaraya_industrial_technological_museum);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.975227, 77.596344?q=Visvesvaraya Industrial & Technological Museum, Kasturba Road, Ambedkar Veedhi, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}