package com.example.splashscreen.delhi;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.splashscreen.R;
import com.example.splashscreen.main.SectionsPageAdapter;
import com.example.splashscreen.delhi.attractions.Delhi_attractions;
import com.example.splashscreen.delhi.food.Delhi_food;
import com.example.splashscreen.delhi.shopping.Delhi_shopping;

public class Delhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.getBackground().setAlpha(0);
        findViewById(R.id.appBarLayoutDelhi).bringToFront();
        findViewById(R.id.tabs).bringToFront();

        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Delhi_attractions(), "");
        mSectionsPageAdapter.addFragment(new Delhi_shopping(), "");
        mSectionsPageAdapter.addFragment(new Delhi_food(), "");
        viewPager.setAdapter(mSectionsPageAdapter);
    }
}
