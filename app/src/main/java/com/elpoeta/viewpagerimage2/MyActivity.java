package com.elpoeta.viewpagerimage2;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class MyActivity extends Activity {

    ViewPagerAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;

    public static Integer[] mImageIds = {
            R.drawable.tn_a1,
            R.drawable.tn_a2,
            R.drawable.tn_a3,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mSectionsPagerAdapter = new ViewPagerAdapter(getFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);

        mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(4, getResources().getColor(R.color.android_blue), R.drawable.tn_a1));
        mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(5, getResources().getColor(R.color.android_darkgreen), mImageIds[1]));
        mSectionsPagerAdapter.addFragment(Fragmentos.newInstance(6, getResources().getColor(R.color.android_red), mImageIds[2]));

        mViewPager.setAdapter(mSectionsPagerAdapter);
    }
}
