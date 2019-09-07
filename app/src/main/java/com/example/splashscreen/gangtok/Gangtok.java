package com.example.splashscreen.gangtok;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.splashscreen.R;
import com.example.splashscreen.gangtok.attractions.Gangtok_attractions;
import com.example.splashscreen.gangtok.food.Gangtok_food;
import com.example.splashscreen.gangtok.shopping.Gangtok_shopping;
import com.example.splashscreen.main.SectionsPageAdapter;

public class Gangtok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangtok);
        Toolbar jaipurToolbar = findViewById(R.id.toolbar_gangtok);
        setSupportActionBar(jaipurToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        jaipurToolbar.getBackground().setAlpha(0);
        findViewById(R.id.appBarLayoutGangtok).bringToFront();
        findViewById(R.id.tabs_gangtok).bringToFront();

        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs_gangtok);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Gangtok_attractions(), "");
        mSectionsPageAdapter.addFragment(new Gangtok_shopping(), "");
        mSectionsPageAdapter.addFragment(new Gangtok_food(), "");
        viewPager.setAdapter(mSectionsPageAdapter);
    }
}