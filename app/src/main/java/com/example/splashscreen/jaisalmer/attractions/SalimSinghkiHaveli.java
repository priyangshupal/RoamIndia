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

public class SalimSinghkiHaveli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salim_singhki_haveli);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.salim_singhki_haveli_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Salim-Singh-ki-Haveli.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_salim_singhki_haveli);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:26.913754, 70.916107?q=Salam Singh Ki Haweli (Moti Mahal), Amar Sagar Pol, Jaisalmer, Rajasthan"));
                startActivity(intent);
            }
        });
    }
}

