package com.example.splashscreen.bangalore.food;

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

public class DumPukhtJollyNabobRestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dum_pukht_jolly_nabob_restaurant);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.dum_pukht_jolly_nabob_restaurant_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Dum-Pukht-Jolly-Nabob-Restaurant.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_dum_pukht_jolly_nabob_restaurant);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.994113, 77.586034?q=Dum Pukht Jolly Nabobs, Golf Course Rd, Abshot Layout, Vasanth Nagar, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}