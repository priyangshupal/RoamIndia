package com.example.splashscreen.port_blair;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.splashscreen.R;
import com.example.splashscreen.main.SectionsPageAdapter;
import com.example.splashscreen.port_blair.attractions.Port_blair_attractions;
import com.example.splashscreen.port_blair.food.Port_blair_food;
import com.example.splashscreen.port_blair.shopping.Port_blair_shopping;

public class PortBlair extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_port_blair);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.getBackground().setAlpha(0);
        findViewById(R.id.appBarLayout).bringToFront();
        findViewById(R.id.tabs).bringToFront();

        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mSectionsPageAdapter.addFragment(new Port_blair_attractions(), "");
        mSectionsPageAdapter.addFragment(new Port_blair_shopping(), "");
        mSectionsPageAdapter.addFragment(new Port_blair_food(), "");
        viewPager.setAdapter(mSectionsPageAdapter);
    }
}
