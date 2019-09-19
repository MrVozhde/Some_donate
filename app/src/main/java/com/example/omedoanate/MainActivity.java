package com.example.omedoanate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.omedoanate.Fragments.Fragment1;
import com.example.omedoanate.Fragments.Fragment2;
import com.example.omedoanate.Fragments.Fragment3;
import com.example.omedoanate.Fragments.Fragment4;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Toolbar toolbar;
    TabLayout tabLayout;

    Fragment1 fragment1 = new Fragment1();
    Fragment2 fragment2 = new Fragment2();
    Fragment3 fragment3 = new Fragment3();
    Fragment4 fragment4 = new Fragment4();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        toolbar = (Toolbar) findViewById(R.id.toolbar_main_id);
        tabLayout = (TabLayout) findViewById(R.id.tabs);


        toolbar.setTitle("Some Donate");
        setSupportActionBar(toolbar);

        setUpViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        setTabsIcons();

    }

    private void setTabsIcons(){
        int[] ids = {R.drawable.ic_sarmaye_24dp , R.drawable.ic_khadamat_24dp , R.drawable.ic_kheirie_24dp
         , R.drawable.ic_mahsol_24dp};
        int selectedColor = Color.parseColor("#2196F3");
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
