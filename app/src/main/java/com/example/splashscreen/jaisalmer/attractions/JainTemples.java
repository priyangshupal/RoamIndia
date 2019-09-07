package com.example.splashscreen.jaisalmer.attractions;

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

public class JainTemples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jain_temples);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.jain_temples_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Jain-Temples-%20Patrick%20Denker-Flickr%20Creative%20commons.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_jain_temples);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:26.912054, 70.911837?q=Jain Temples, Khejer Para, Manak Chowk, Amar Sagar Pol, Jaisalmer, Rajasthan"));
                startActivity(intent);
            }
        });
    }
}
