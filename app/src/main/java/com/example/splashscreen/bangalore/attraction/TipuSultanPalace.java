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

public class TipuSultanPalace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipu_sultan_palace);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.tipu_sultan_palace_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Tipu-Sultan-Palace-Sean-Ellis-Flickr-Creative-commons.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_tipu_sultan_palace);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.959359, 77.573646?q=Tipu Sultan's Summer Palace, Tippu Sultan Palace Road, Chamrajpet, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}