package com.hjz.helloworld.ViewPager;

import android.content.Context;
import android.util.Log;
import android.view.View;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.hjz.helloworld.R;

import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {
    private List<Fragment> mflist;
    private String[] titles;
    public void setList(List<Fragment> flist){
        this.mflist = flist;
    }
    public void setTitles(String[] titles){
        this.titles = titles;
    }
    public MyAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        //Log.d("yyyhjz", "getItem: get");
        return mflist.get(position);
    }

    @Override
    public int getCount() {
        return mflist.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
