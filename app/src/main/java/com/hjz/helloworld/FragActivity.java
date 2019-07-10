package com.hjz.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.hjz.helloworld.ViewPager.Fragment1;
import com.hjz.helloworld.ViewPager.Fragment2;
import com.hjz.helloworld.ViewPager.Fragment3;
import com.hjz.helloworld.ViewPager.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragActivity extends AppCompatActivity {
    private FragmentPagerAdapter mAdapter;
    private List<Fragment> mslist = new ArrayList<>();
    private String[] titles = {"页面1","页面2","页面3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.d("yyyhjz", "onCreate: 1");
        setContentView(R.layout.layout_fragment);
        ViewPager v = findViewById(R.id.Fg_VP);
        TabLayout t = (TabLayout)findViewById(R.id.F_TabLayout);
        //Log.d("yyyhjz", "2");

        mslist.add(new Fragment1());

        //Log.d("yyyhjz","3");
        mslist.add(new Fragment2());
        mslist.add(new Fragment3());

        mAdapter = new MyAdapter(getSupportFragmentManager());
        ((MyAdapter) mAdapter).setList(mslist);
        ((MyAdapter) mAdapter).setTitles(titles);
        v.setAdapter(mAdapter);
        //Log.d("yyyhjz", "onCreate: 4");
        t.setupWithViewPager(v);
    }
}
