package com.example.splashscreen.jaipur.attractions;

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

public class DiwaneAm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diwane_am);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.diwane_am_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Diwan-e-Am-Jaipur.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_diwane_am);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:26.926269, 75.824467?q=Diwan - e - Am"));
                startActivity(intent);
            }
        });
    }
}