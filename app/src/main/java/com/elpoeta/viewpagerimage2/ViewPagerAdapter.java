package com.elpoeta.viewpagerimage2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments; //acá voy a guardar los fragments

    //constructor
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = new ArrayList<Fragment>();
    }

    @Override
    public Fragment getItem(int position) {
        //return PlaceholderFragment.newInstance(position + 1);
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        //return 3;
        return this.fragments.size();
    }

    public void addFragment(Fragment xfragment){
        this.fragments.add(xfragment);
    }
}
