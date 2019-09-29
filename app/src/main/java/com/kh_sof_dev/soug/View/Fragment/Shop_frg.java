package com.kh_sof_dev.soug.View.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kh_sof_dev.soug.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Shop_frg extends Fragment {


    public Shop_frg() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop_frg, container, false);
    }

}
