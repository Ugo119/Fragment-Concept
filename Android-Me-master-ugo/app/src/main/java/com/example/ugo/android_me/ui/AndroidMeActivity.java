package com.example.ugo.android_me.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ugo.android_me.R;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        //Create an instance of the BodyPartFragment for the head fragment
        BodyPartFragment headFragment = new BodyPartFragment();

        //Create an instance of the BodyPartFragment for the body fragment
        BodyPartFragment bodyFragment = new BodyPartFragment();

        //Create an instance of the BodyPartFragment for the leg fragment
        BodyPartFragment legFragment = new BodyPartFragment();


        //Use FragmentManager and transaction to add the fragment to the screen
        FragmentManager fragmentManager = getSupportFragmentManager();

        //Fragment Support
        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();


        }
    }

