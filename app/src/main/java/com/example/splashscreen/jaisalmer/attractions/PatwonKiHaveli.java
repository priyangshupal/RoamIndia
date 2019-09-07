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

public class PatwonKiHaveli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patwon_ki_haveli);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        new DownloadImageFromInternet((ImageView) findViewById(R.id.patwon_ki_haveli_image))
                .execute("https://www.makemytrip.com/travel-guide/media/dg_image/jaisalmer/Patwon-Ki-Haveli.jpg");

        FloatingActionButton fab = findViewById(R.id.fab_patwon_ki_haveli);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:26.916323, 70.914352?q=Patwon ki Haveli/ Patwa Haveli (Kothari's Patwa Haveli), Amar Sagar Pol, Jaisalmer, Rajasthan"));
                startActivity(intent);
            }
        });
    }
}
