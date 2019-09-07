package com.example.splashscreen.bangalore.attraction;

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

public class SreeSiddagangaMutt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sree_siddaganga_mutt);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.sree_siddaganga_mutt_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Devanahalli-Fort-in-Bangalore-Dushyant-Naresh-wikimedia.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_sree_siddaganga_mutt);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:13.321813, 77.148463?q=Sree Siddaganga Mutt, Siddaganga Mata Road, Voda Sector B, Tumakuru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}