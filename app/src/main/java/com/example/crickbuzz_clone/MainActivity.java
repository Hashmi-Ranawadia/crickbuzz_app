package com.example.crickbuzz_clone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.crickbuzz_clone.fragments.HomeFragment;
import com.example.crickbuzz_clone.fragments.MatchesFragment;
import com.example.crickbuzz_clone.fragments.MoreFragment;
import com.example.crickbuzz_clone.fragments.NewsFragment;
import com.example.crickbuzz_clone.fragments.VideosFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.LabelVisibilityMode;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    public static final String apiKey = "6a0c89543amshc0bd7c7670816c4p1b206ejsn1904ec42760b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new HomeFragment()).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case R.id.mainhome:
                        item.setChecked(true);
                        fragment = new HomeFragment();
                        break;
                    case R.id.matches:
                        item.setChecked(true);
                        fragment = new MatchesFragment();
                        break;
                    case R.id.videos:
                        item.setChecked(true);
                        fragment = new VideosFragment();
                        break;
                    case R.id.news:
                        item.setChecked(true);
                        fragment = new NewsFragment();
                        break;
                    case R.id.more:
                        item.setChecked(true);
                        fragment = new MoreFragment();
                        break;
                }


                loadFragment(fragment);
                return false;
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
    }
}