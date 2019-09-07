package com.example.splashscreen.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.splashscreen.Adapters.Adapter_Main;
import com.example.splashscreen.R;
import com.example.splashscreen.agra.Agra;
import com.example.splashscreen.bangalore.Bangalore;
import com.example.splashscreen.delhi.Delhi;
import com.example.splashscreen.gangtok.Gangtok;
import com.example.splashscreen.jaipur.Jaipur;
import com.example.splashscreen.jaisalmer.Jaisalmer;
import com.example.splashscreen.leh.Leh;
import com.example.splashscreen.port_blair.PortBlair;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.bringToFront();
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        TextView app_name_text = findViewById(R.id.app_name_text);
        Typeface mainToolbarTypeface = Typeface.createFromAsset(this.getAssets(), "fonts/KaushanScript-Regular.ttf");
        app_name_text.setTypeface(mainToolbarTypeface);

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        // Get details on the currently active default data network
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        // If there is a network connection, fetch data
        if (networkInfo != null && networkInfo.isConnected()) {

            ArrayList<Places_Main> places_main = new ArrayList<>();
            places_main.add(new Places_Main(R.drawable.delhi_main_header, "https://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=8a988b9218b4d04d16eadacddc375d82"));
            places_main.add(new Places_Main(R.drawable.agra_main_header, "https://api.openweathermap.org/data/2.5/weather?q=Agra&appid=8a988b9218b4d04d16eadacddc375d82"));
            places_main.add(new Places_Main(R.drawable.jaipur_main_header, "https://api.openweathermap.org/data/2.5/weather?q=Jaipur&appid=8a988b9218b4d04d16eadacddc375d82"));
            places_main.add(new Places_Main(R.drawable.bangalore_main_header, "https://api.openweathermap.org/data/2.5/weather?q=Bangalore&appid=8a988b9218b4d04d16eadacddc375d82"));
            places_main.add(new Places_Main(R.drawable.jaisalmer_main_header, "https://api.openweathermap.org/data/2.5/weather?q=Jaisalmer&appid=8a988b9218b4d04d16eadacddc375d82"));
            places_main.add(new Places_Main(R.drawable.leh_main_header, "https://api.openweathermap.org/data/2.5/weather?q=Leh&appid=8a988b9218b4d04d16eadacddc375d82"));
            places_main.add(new Places_Main(R.drawable.gangtok_main_header, "https://api.openweathermap.org/data/2.5/weather?q=Gangtok&appid=8a988b9218b4d04d16eadacddc375d82"));
            places_main.add(new Places_Main(R.drawable.port_blair_main_header, "https://api.openweathermap.org/data/2.5/weather?id=1259385&appid=8a988b9218b4d04d16eadacddc375d82"));

            ListView main_list = findViewById(R.id.main_list);
            main_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            Intent intent0 = new Intent(getApplicationContext(), Delhi.class);
                            startActivity(intent0);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getApplicationContext(), Agra.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(getApplicationContext(), Jaipur.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getApplicationContext(), Bangalore.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(getApplicationContext(), Jaisalmer.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(getApplicationContext(), Leh.class);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(getApplicationContext(), Gangtok.class);
                            startActivity(intent6);
                            break;
                        case 7:
                            Intent intent7 = new Intent(getApplicationContext(), PortBlair.class);
                            startActivity(intent7);
                            break;
                    }
                }
            });
            Adapter_Main adapter_main = new Adapter_Main(this, places_main);
            main_list.setAdapter(adapter_main);
        } else {
            findViewById(R.id.no_internet).setVisibility(View.VISIBLE);
            RelativeLayout currentLayout = findViewById(R.id.main);
            currentLayout.setBackgroundColor(Color.parseColor("#F7F7F7"));

            Button refresh = findViewById(R.id.refresh);
            refresh.setVisibility(View.VISIBLE);
            refresh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ConnectivityManager connMgr = (ConnectivityManager)
                            getSystemService(Context.CONNECTIVITY_SERVICE);

                    // Get details on the currently active default data network
                    NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

                    // If there is a network connection, fetch data
                    if (networkInfo != null && networkInfo.isConnected()) {
                        Intent refresh = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(refresh);
                    } else {
                        Toast.makeText(MainActivity.this, "No Internet", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please back again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        // Get details on the currently active default data network
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        // If there is a network connection, fetch data
        if (networkInfo != null && networkInfo.isConnected()) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_choose_location) {
            Intent intent = new Intent(getApplicationContext(), ChooseLocation.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
