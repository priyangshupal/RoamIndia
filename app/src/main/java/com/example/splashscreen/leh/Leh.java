package com.example.splashscreen.leh;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.splashscreen.R;
import com.example.splashscreen.leh.attractions.Leh_attractions;
import com.example.splashscreen.leh.food.Leh_food;
import com.example.splashscreen.leh.shopping.Leh_shopping;
import com.example.splashscreen.main.SectionsPageAdapter;

public class Leh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leh);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.getBackground().setAlpha(0);
        findViewById(R.id.appBarLayoutLeh).bringToFront();
        findViewById(R.id.tabs_leh).bringToFront();

        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs_leh);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Leh_attractions(), "");
        mSectionsPageAdapter.addFragment(new Leh_shopping(), "");
        mSectionsPageAdapter.addFragment(new Leh_food(), "");
        viewPager.setAdapter(mSectionsPageAdapter);
    }
}
