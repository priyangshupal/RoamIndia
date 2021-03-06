package com.example.splashscreen.leh.shopping;

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

public class TibetanRefugeeMarket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tibetan_refugee_market);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.tibetan_refugee_market_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/leh/THE-TIBETAN-REFUGEE-MARKET_Flickr-Creative-Commons_Saad-Faruque.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_tibetan_refugee_market);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:34.071575, 77.632754?q=Tibetan Refugee Handicrafts Market, Near, Leh Manali Highway, Shey"));
                startActivity(intent);
            }
        });
    }
}
