package com.example.ugo.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ugo.android_me.R;
import com.example.ugo.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    //Mandatory constructor for instantiating the fragment
    public BodyPartFragment(){

    }

    //Override the onCreateView method of the fragment
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Inflate the Android-me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part,container,false);

        //Get a reference to the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        //Set the image resource to display
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        //Return rootView
        return rootView;
    }
}