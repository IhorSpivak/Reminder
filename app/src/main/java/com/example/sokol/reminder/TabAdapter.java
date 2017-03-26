package com.example.sokol.reminder;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sokol.reminder.fragments.CurrentTaskFragment;
import com.example.sokol.reminder.fragments.DoneTaskFragment;

/**
 * Created by Sokol on 25.03.2017.
 */

public class TabAdapter extends FragmentStatePagerAdapter {
    private int numberOfTabs;

    public TabAdapter(android.support.v4.app.FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return new CurrentTaskFragment();
            case 1:
                return new DoneTaskFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
