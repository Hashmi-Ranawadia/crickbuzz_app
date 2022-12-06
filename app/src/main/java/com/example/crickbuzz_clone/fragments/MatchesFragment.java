package com.example.crickbuzz_clone.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crickbuzz_clone.R;
import com.google.android.material.tabs.TabLayout;


public class MatchesFragment extends Fragment {


    TabLayout tab_layout;
    ViewPager view_pager;
    LiveFragment liveFragment;
    UpcomingFragment upcomingFragment;
    RecentFragment recentFragment;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_matches, container, false);

        tab_layout = view.findViewById(R.id.tab_layout);
        view_pager = view.findViewById(R.id.view_pager);

        liveFragment = new LiveFragment();
        upcomingFragment = new UpcomingFragment();
        recentFragment = new RecentFragment();

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getChildFragmentManager());

        tab_layout.setupWithViewPager(view_pager);
        view_pager.setAdapter(myPagerAdapter);

        return view;
    }

    class MyPagerAdapter extends FragmentPagerAdapter{

        String[] itemNames = {"LIVE", "UPCOMING", "RECENT"};
        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return liveFragment;
                case 1:
                    return upcomingFragment;
                case 2:
                    return recentFragment;
            }
            return null;
        }

        @Override
        public int getCount() {
            return itemNames.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return itemNames[position];
        }
    }
}