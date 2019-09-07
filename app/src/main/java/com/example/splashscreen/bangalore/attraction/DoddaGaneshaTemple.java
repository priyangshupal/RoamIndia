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

public class DoddaGaneshaTemple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodda_ganesha_temple);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.dodda_ganesha_temple_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/bangalore/Dodda-Ganesha-Temple_Bangalore.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_dodda_ganesha_temple);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:12.942907, 77.568209?q=Shree Dodda Ganapathi Temple, Bull Temple Road, Basavanagudi, Bengaluru, Karnataka"));
                startActivity(intent);
            }
        });
    }
}