package com.example.cdeft.penny;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cdeft on 2/11/2016.
 */
public class HomeFragment extends Fragment {
    View view;
    MainActivity mainActivity;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_fragment,container,false);
        setupToolbar();

        return view;
    }

    private void setupToolbar() {
        mainActivity = new MainActivity();
        mainActivity.toolbarTitle.setText("Penny");

    }
}
