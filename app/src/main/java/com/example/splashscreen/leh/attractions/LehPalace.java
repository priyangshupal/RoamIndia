package com.example.splashscreen.leh.attractions;

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

public class LehPalace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leh_palace);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.leh_palace_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/leh/Leh-Palace-Leh.jpg");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:34.165984, 77.586573?q=Leh Palace, Leh"));
                startActivity(intent);
            }
        });
    }
}