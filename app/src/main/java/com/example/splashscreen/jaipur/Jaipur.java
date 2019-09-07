package com.example.splashscreen.jaipur;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.splashscreen.R;
import com.example.splashscreen.main.SectionsPageAdapter;
import com.example.splashscreen.jaipur.attractions.Jaipur_attractions;
import com.example.splashscreen.jaipur.food.Jaipur_food;
import com.example.splashscreen.jaipur.shopping.Jaipur_shopping;

public class Jaipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipur);

        Toolbar jaipurToolbar = findViewById(R.id.toolbar_jaipur);
        setSupportActionBar(jaipurToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        jaipurToolbar.getBackground().setAlpha(0);
        findViewById(R.id.appBarLayoutJaipur).bringToFront();
        findViewById(R.id.tabs_jaipur).bringToFront();

        ViewPager viewPager = findViewById(R.id.viewPager_jaipur);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs_jaipur);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Jaipur_attractions(), "");
        mSectionsPageAdapter.addFragment(new Jaipur_shopping(), "");
        mSectionsPageAdapter.addFragment(new Jaipur_food(), "");
        viewPager.setAdapter(mSectionsPageAdapter);
    }
}