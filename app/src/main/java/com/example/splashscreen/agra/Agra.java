package com.example.splashscreen.agra;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.splashscreen.R;
import com.example.splashscreen.main.SectionsPageAdapter;
import com.example.splashscreen.agra.attractions.Agra_attractions;
import com.example.splashscreen.agra.food.Agra_food;
import com.example.splashscreen.agra.shopping.Agra_shopping;

public class Agra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agra);

        Toolbar agraToolbar = findViewById(R.id.toolbar_agra);
        setSupportActionBar(agraToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        agraToolbar.getBackground().setAlpha(0);
        findViewById(R.id.appBarLayoutAgra).bringToFront();
        findViewById(R.id.tabs_agra).bringToFront();

        ViewPager viewPager = findViewById(R.id.viewPager_agra);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs_agra);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Agra_attractions(), "");
        mSectionsPageAdapter.addFragment(new Agra_shopping(), "");
        mSectionsPageAdapter.addFragment(new Agra_food(), "");
        viewPager.setAdapter(mSectionsPageAdapter);
    }
}