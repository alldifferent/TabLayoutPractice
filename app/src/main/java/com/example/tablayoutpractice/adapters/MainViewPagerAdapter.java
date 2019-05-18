package com.example.tablayoutpractice.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.tablayoutpractice.fragments.ChatFragment;
import com.example.tablayoutpractice.fragments.HomeFragment;
import com.example.tablayoutpractice.fragments.SearchFragment;

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTab;
    Fragment frag1, frag2, frag3;

    public MainViewPagerAdapter(FragmentManager fm, int numOfTab){

        super(fm);
        mNumOfTab = numOfTab;

    }

    @Override
    public Fragment getItem(int position) {

        Fragment fr = null;

        if (position == 0){
            if (frag1 == null){
                frag1 = new HomeFragment();
            }
            fr = frag1;
        }else if (position == 1){
            if (frag2 == null){
                frag2 = new ChatFragment();
            }
            fr = frag2;
        }else if (position == 2){
            if (frag3 == null){
                frag3 = new SearchFragment();
            }
            fr = frag3;
        }

        return fr;


    }

    @Override
    public int getCount() {

        return mNumOfTab;
    }


}
