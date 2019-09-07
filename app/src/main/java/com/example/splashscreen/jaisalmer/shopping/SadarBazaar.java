package com.example.splashscreen.jaisalmer.shopping;

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

public class SadarBazaar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadar_bazaar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.sadar_bazaar_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Sadar-Bazaar.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_sadar_bazaar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:26.923978, 75.817422?q=Sadar Bazar, Mishra Rajaji Ka Rasta, Kishanpole Bazar, Chandpole Bazar, Chandpole, Chandpol, Jaipur, Rajasthan"));
                startActivity(intent);
            }
        });
    }
}