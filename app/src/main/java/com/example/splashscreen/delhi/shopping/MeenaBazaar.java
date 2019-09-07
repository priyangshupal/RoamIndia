package com.example.splashscreen.delhi.shopping;

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

public class MeenaBazaar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meena_bazaar);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.meena_bazaar_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Meena-Bazaar-Delhi.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_meena_bazaar);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:28.651688, 77.235969?q=Meena Bazaar, Jama Masjid, Chandni Chowk, New Delhi, Delhi"));
                startActivity(intent);
            }
        });
    }
}
