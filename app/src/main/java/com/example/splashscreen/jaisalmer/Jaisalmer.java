package com.example.splashscreen.jaisalmer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.splashscreen.R;
import com.example.splashscreen.jaisalmer.attractions.Jaisalmer_attractions;
import com.example.splashscreen.jaisalmer.food.Jaisalmer_food;
import com.example.splashscreen.jaisalmer.shopping.Jaisalmer_shopping;
import com.example.splashscreen.main.SectionsPageAdapter;

public class Jaisalmer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaisalmer);
        Toolbar jaipurToolbar = findViewById(R.id.toolbar_jaisalmer);
        setSupportActionBar(jaipurToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        jaipurToolbar.getBackground().setAlpha(0);
        findViewById(R.id.appBarLayoutJaisalmer).bringToFront();
        findViewById(R.id.tabs_jaisalmer).bringToFront();

        ViewPager viewPager = findViewById(R.id.viewPager_jaisalmer);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs_jaisalmer);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Jaisalmer_attractions(), "");
        mSectionsPageAdapter.addFragment(new Jaisalmer_shopping(), "");
        mSectionsPageAdapter.addFragment(new Jaisalmer_food(), "");
        viewPager.setAdapter(mSectionsPageAdapter);
    }
}