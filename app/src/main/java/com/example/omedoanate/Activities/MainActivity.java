package com.example.omedoanate.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.omedoanate.Fragments.Fragment1;
import com.example.omedoanate.Fragments.Fragment2;
import com.example.omedoanate.Fragments.Fragment3;
import com.example.omedoanate.Fragments.Fragment4;
import com.example.omedoanate.R;
import com.example.omedoanate.Util;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Toolbar toolbar;
    TabLayout tabLayout;
    DrawerLayout drawerLayout;

    NavigationView navigationView;
    Fragment1 fragment1 = new Fragment1();
    Fragment2 fragment2 = new Fragment2();
    Fragment3 fragment3 = new Fragment3();
    Fragment4 fragment4 = new Fragment4();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.navigation_view_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        toolbar = (Toolbar) findViewById(R.id.toolbar_main_id);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout_id);

        toolbar.setTitle("Some Donate");
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this , drawerLayout , toolbar , 0 , 0);
        toggle.syncState();

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        setTabsIcons();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.person_info_id :{
                        startActivity(new Intent(MainActivity.this , SignUp.class));
                        drawerLayout.closeDrawers();
                        break;
                    }
                    case R.id.login_id :{
                        Toast.makeText(MainActivity.this, "ورود", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.profile_id:{
                        startActivity(new Intent(MainActivity.this , Profile.class));
                        drawerLayout.closeDrawers();
                        break;
                    }
                }
                return true;
            }
        });

    }

    private void setTabsIcons(){
        int[] ids = {R.drawable.ic_sarmaye_24dp , R.drawable.ic_khadamat_24dp , R.drawable.ic_kheirie_24dp
         , R.drawable.ic_mahsol_24dp};
        int selectedColor = Color.parseColor("#424242");
        int unSelectedColor = Color.parseColor("#ffffff");
        Util.setupTabIcons(getApplicationContext() , tabLayout , ids , 1 , selectedColor , unSelectedColor);
    }

    private void setUpViewPager(ViewPager upViewPager){
        Util.ViewPagerAdapter adapter = new Util.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(fragment1 , "fragment1");
        adapter.addFragment(fragment2 , "fragment2");
        adapter.addFragment(fragment3 , "fragment3");
        adapter.addFragment(fragment4 , "fragment4");
        viewPager.setAdapter(adapter);
    }
}
