package com.example.splashscreen.main;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.splashscreen.R;
import com.example.splashscreen.agra.Agra;
import com.example.splashscreen.bangalore.Bangalore;
import com.example.splashscreen.delhi.Delhi;
import com.example.splashscreen.gangtok.Gangtok;
import com.example.splashscreen.jaipur.Jaipur;
import com.example.splashscreen.jaisalmer.Jaisalmer;
import com.example.splashscreen.leh.Leh;
import com.example.splashscreen.port_blair.PortBlair;

public class ChooseLocation extends AppCompatActivity {

    ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_location);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        TextView app_name_text = findViewById(R.id.choose_location_text);
        Typeface mainToolbarTypeface =Typeface.createFromAsset(this.getAssets(), "fonts/KaushanScript-Regular.ttf");
        app_name_text.setTypeface(mainToolbarTypeface);

        final ListView mListView = findViewById(R.id.list);
        TextView mEmptyView = findViewById(R.id.emptyView);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int position, long l) {
                String class_name = (String) mListView.getItemAtPosition(position);
                switch (class_name) {
                    case "Delhi":
                        Intent Delhi = new Intent(getApplicationContext(), Delhi.class);
                        startActivity(Delhi);
                        break;
                    case "Agra":
                        Intent Agra = new Intent(getApplicationContext(), Agra.class);
                        startActivity(Agra);
                        break;
                    case "Jaipur":
                        Intent Jaipur = new Intent(getApplicationContext(), Jaipur.class);
                        startActivity(Jaipur);
                        break;
                    case "Bangalore":
                        Intent Bangalore = new Intent(getApplicationContext(), Bangalore.class);
                        startActivity(Bangalore);
                        break;
                    case "Jaisalmer":
                        Intent Jaisalmer = new Intent(getApplicationContext(), Jaisalmer.class);
                        startActivity(Jaisalmer);
                        break;
                    case "Leh":
                        Intent Leh = new Intent(getApplicationContext(), Leh.class);
                        startActivity(Leh);
                        break;
                    case "Gangtok":
                        Intent Gangtok = new Intent(getApplicationContext(), Gangtok.class);
                        startActivity(Gangtok);
                        break;
                    case "Port Blair":
                        Intent Port_Blair = new Intent(getApplicationContext(), PortBlair.class);
                        startActivity(Port_Blair);
                        break;
                }
            }
        });
        mListView.setEmptyView(mEmptyView);

        mAdapter = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.places_array));
        mListView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem mSearch = menu.findItem(R.id.action_search);
        SearchView mSearchView = (SearchView) mSearch.getActionView();
        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
