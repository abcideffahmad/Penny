package com.example.cdeft.penny;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by cdeft on 2/11/2016.
 */
public class ProfileFragment extends Fragment {
    View view;

    MainActivity mainActivity;
    static  final  String TAG = "profilefragment_tag";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.profile_fragment,container,false);
        setupToolbar();

        return view;
    }

    private void setupToolbar() {
        mainActivity = new MainActivity();
        mainActivity.toolbarTitle.setText("Profile");
        mainActivity.backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment homeFragment = new HomeFragment();
                setupFragment(homeFragment);
                mainActivity.backIcon.setVisibility(View.GONE);

                Log.i(TAG,"back icon clicked");


            }
        });
        mainActivity.backIcon.setVisibility(View.VISIBLE);

    }

    private void setupFragment(Fragment homeFragment) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.body_container, homeFragment);
        fragmentTransaction.commit();
    }
}
