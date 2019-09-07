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

public class CentralCottageIndustriesEmporium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_cottage_industries_emporium);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.central_cottage_industries_emporium_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Central-Cottage-Industries-Emporium-Delhi.jpg");


        FloatingActionButton fab = findViewById(R.id.fab_central_cottage_industries_emporium);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:28.625920, 77.219791?q=Central Cottage Industries Emporium, Janpath Road, HC Mathur Lane, New Delhi, Delhi"));
                startActivity(intent);
            }
        });
    }
}
