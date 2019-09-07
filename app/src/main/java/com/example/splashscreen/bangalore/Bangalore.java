package com.example.splashscreen.bangalore;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.splashscreen.R;
import com.example.splashscreen.main.SectionsPageAdapter;
import com.example.splashscreen.bangalore.attraction.Bangalore_attractions;
import com.example.splashscreen.bangalore.food.Bangalore_food;
import com.example.splashscreen.bangalore.shopping.Bangalore_shopping;

public class Bangalore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangalore);

        Toolbar bangaloreToolbar = findViewById(R.id.toolbar_jaipur);
        setSupportActionBar(bangaloreToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        bangaloreToolbar.getBackground().setAlpha(0);
        findViewById(R.id.appBarLayoutBangalore).bringToFront();
        findViewById(R.id.tabs_bangalore).bringToFront();

        ViewPager viewPager = findViewById(R.id.viewPager_jaipur);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs_bangalore);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Bangalore_attractions(), "");
        mSectionsPageAdapter.addFragment(new Bangalore_shopping(), "");
        mSectionsPageAdapter.addFragment(new Bangalore_food(), "");
        viewPager.setAdapter(mSectionsPageAdapter);
    }
}
