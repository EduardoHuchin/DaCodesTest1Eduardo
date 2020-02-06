package com.example.venadostest;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.venadostest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CopaMXFragment extends Fragment {


    public CopaMXFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_copa_mx, container, false);
    }

}
