package com.example.ugo.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ugo.android_me.R;
import com.example.ugo.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        //Create an instance of the BodyPartFragment for the head fragment
        BodyPartFragment headFragment = new BodyPartFragment();
        //Set a list of  image ids for the head  fragment and set the position to the second image in the
        headFragment.setImageId(AndroidImageAssets.getHeads());
        headFragment.setListIndex(1);

        //Use FragmentManager and transaction to add the fragment to the screen
        FragmentManager fragmentManager = getSupportFragmentManager();

        //Fragment Support
        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();


        //Create an instance of the BodyPartFragment for the body fragment
        BodyPartFragment bodyFragment = new BodyPartFragment();
        headFragment.setImageId(AndroidImageAssets.getBodies());
        //Fragment Support
        fragmentManager.beginTransaction()
                .add(R.id.body_container, bodyFragment)
                .commit();

        //Create an instance of the BodyPartFragment for the leg fragment
        BodyPartFragment legFragment = new BodyPartFragment();
        headFragment.setImageId(AndroidImageAssets.getLegs());
        //Fragment Support
        fragmentManager.beginTransaction()
                .add(R.id.legs_container, legFragment)
                .commit();


        }



}



