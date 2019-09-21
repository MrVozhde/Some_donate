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
import com.example.omedoanate.Fragments.Sarmaye;
import com.example.omedoanate.Fragments.Khadamat;
import com.example.omedoanate.Fragments.Kheirie;
import com.example.omedoanate.Fragments.Mahsolat;
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
    Sarmaye fragment1 = new Sarmaye();
    Khadamat fragment2 = new Khadamat();
    Kheirie fragment3 = new Kheirie();
    Mahsolat fragment4 = new Mahsolat();

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
                    case R.id.information_id:{
                        Toast.makeText(MainActivity.this, "راهنما", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.show_qrcode_id:{
                        Toast.makeText(MainActivity.this, "نمایش کد", Toast.LENGTH_SHORT).show();
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
        Util.setupTabIcons(getApplicationContext() , tabLayout , ids , 2 , selectedColor , unSelectedColor);
    }

    private void setUpViewPager(ViewPager upViewPager){
        Util.ViewPagerAdapter adapter = new Util.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(fragment1 , "سرمایه");
        adapter.addFragment(fragment2 , "خدمات");
        adapter.addFragment(fragment3 , "خیریه");
        adapter.addFragment(fragment4 , "محصولات");
        viewPager.setAdapter(adapter);
    }
}
