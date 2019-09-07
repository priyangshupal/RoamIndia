package com.example.splashscreen.delhi.food;

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

public class ChachaKeCholleyBhature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chacha_ke_cholley_bhature);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.chacha_ke_chole_bhature_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Chacha-Ke-Cholley-Bhature-Delhi.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_chacha_ke_chole_bhature);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:28.705858, 77.190035?q=Chacha's Chole bhature, Model Town Phase II, Block H, Phase 2, Model Town, Delhi"));
                startActivity(intent);
            }
        });
    }
}