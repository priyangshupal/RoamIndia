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

public class Wonderla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonderla);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.wonderla_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Wonderla-Amusement-Park.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_wonderla);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.834562, 77.400970?q=Wonderla Bangalore, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}