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

public class TughlaqabadFort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tughlaqabad_fort);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.tughlaqabad_fort_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/delhi/Tughlaqabad-Fort-Delhi.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_tughlaqabad_fort);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:28.514338, 77.260107?q=Tughlakabad Fort, Tughlaqabad Fort, Tughlakabad, New Delhi, Delhi"));
                startActivity(intent);
            }
        });
    }
}
