package com.example.splashscreen.bangalore.shopping;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.splashscreen.R;
import com.example.splashscreen.DownloadImageFromInternet;

public class OrionMall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orion_mall);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.orion_mall_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Commercial-Street-Ananth-BS-Flickr-Creative-commons.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_orion_mall);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:13.011015, 77.554828?q=Orion Mall, Doctor Rajkumar Road, Rajajinagar, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}
