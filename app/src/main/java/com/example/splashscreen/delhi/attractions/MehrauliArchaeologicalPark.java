package com.example.splashscreen.delhi.attractions;

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

public class MehrauliArchaeologicalPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mehrauli_archaeological_park);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.mehrauli_archaeological_park_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Mehrauli-Archaeological-Park-Delhi.jpg");


        FloatingActionButton fab = findViewById(R.id.fab_mehrauli_archaeological_park);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:28.520261, 77.187690?q=Mehrauli Archaeological Park, Anuvrat Marg, Opposite Qutub Minar Metro Station, Christian Colony, Mehrauli, New Delhi, Delhi"));
                startActivity(intent);
            }
        });
    }
}
