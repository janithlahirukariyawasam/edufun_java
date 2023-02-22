package com.quintus.labs.edufun.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.group4.edufun.R;



/**
 * A simple {@link Fragment} subclass.
 */
public class DrawingFragment extends Fragment {


    public DrawingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_drawing, container, false);

        return view;
    }


}
