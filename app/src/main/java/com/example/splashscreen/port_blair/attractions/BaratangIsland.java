package com.example.splashscreen.port_blair.attractions;

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

public class BaratangIsland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baratang_island);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.baratang_island_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/port_blair/Baratang-Island1.jpg");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.147256, 92.764781?q=Baratang Island, Andaman and Nicobar Islands"));
                startActivity(intent);
            }
        });
    }
}

