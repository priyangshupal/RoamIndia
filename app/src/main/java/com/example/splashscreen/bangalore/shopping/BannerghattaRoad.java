package com.example.splashscreen.bangalore.shopping;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.splashscreen.R;
import com.example.splashscreen.DownloadImageFromInternet;

public class BannerghattaRoad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bannerghatta_road);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.bannerghatta_road_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Bannerghatta-Road.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_bannerghatta_road);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.992388, 77.571511?q=Bannerghatta Road, Jai Bheema Nagar, Seshadripuram, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}
