package com.example.globetoday;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CategoryPagerAdapter extends FragmentStatePagerAdapter {
    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryPagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GeneralFragment();
        } else if (position == 1) {
            return new EntertainmentFragment();
        } else if (position == 2) {
            return new SportsFragment();
        } else {
            return new TechFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_general);
        } else if (position == 1) {
            return mContext.getString(R.string.category_politics);
        } else if (position == 2) {
            return mContext.getString(R.string.category_sports);
        } else {
            return mContext.getString(R.string.category_tech);
        }
    }
}
