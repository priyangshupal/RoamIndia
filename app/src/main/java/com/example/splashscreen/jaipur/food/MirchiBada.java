package com.example.splashscreen.jaipur.food;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.splashscreen.DownloadImageFromInternet;
import com.example.splashscreen.R;

public class MirchiBada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mirchi_bada);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.mirchi_bada_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/jaipur/Mirchi-Bada-www.theedinburghblog.co_.uk_.jpg");
    }
}