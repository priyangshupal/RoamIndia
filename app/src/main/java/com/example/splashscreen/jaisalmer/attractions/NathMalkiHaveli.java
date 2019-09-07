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

public class NathMalkiHaveli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nath_malki_haveli);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.nath_malki_haveli_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Nath-Mal-ki-Haveli-Manoj-Kengudelu-Flickr-Creative-commons.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_nath_malki_haveli);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:26.915768, 70.912675?q=Nathmal Ki Haveli, Sadar Bazar, Jaisalmer, Rajasthan"));
                startActivity(intent);
            }
        });
    }
}
