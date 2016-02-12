package com.example.cdeft.penny;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    static TextView toolbarTitle;
    static ImageView backIcon;


    static final String TAG = "mainactivity_tag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");
        toolBarSetup();
        initialHomeFragment();

    }



    private void initialHomeFragment() {
        Fragment homeFragment = new HomeFragment();
        setupFragment(homeFragment);
    }

    public void setupFragment(Fragment fragment) {
        //method for fragment transaction

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.body_container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.profile:
                //suppose to open profile fragment
                Fragment profileFragment = new ProfileFragment();
                setupFragment(profileFragment);
                Log.i(TAG, "profile menu clicked");
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu, menu);

        return true;
    }

    private void toolBarSetup() {
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        toolbarTitle = (TextView) findViewById(R.id.title);
        backIcon = (ImageView)findViewById(R.id.back_icon);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


    }


}
