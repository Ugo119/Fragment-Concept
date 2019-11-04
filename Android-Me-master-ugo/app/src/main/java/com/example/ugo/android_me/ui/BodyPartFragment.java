package com.example.ugo.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ugo.android_me.R;
import com.example.ugo.android_me.data.AndroidImageAssets;

import java.util.List;

public class BodyPartFragment extends Fragment {
    //Create a tag for logging
    private static final String TAG = "BodyPartFragment";

    private List<Integer> mImageId;
    private int mListIndex;

    //Mandatory constructor for instantiating the fragment
    public BodyPartFragment(){

    }

    //Override the onCreateView method of the fragment
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Inflate the Android-me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part,container,false);

        //Get a reference to the ImageView in the fragment layout
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

       if(mImageId != null){
           //Set the image resource to the list item at the stored index
           imageView.setImageResource(mImageId.get(mListIndex));

           imageView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   if(mListIndex < mImageId.size()-1){
                       mListIndex++;
                   }else{mListIndex = 0;}
                   imageView.setImageResource(mImageId.get(mListIndex));
               }
           });
       }else{
           //Log a message saying the image id list is null
           Log.v(TAG,"fragment has a null list of image ids");
       }

        //Return rootView
        return rootView;
    }

    //Setter methods for keeping track of the list images this fragment can display and which image
    //in the list is currently being displayed
    public void setImageId(List<Integer> imageId){
        mImageId = imageId;


    }
    public void setListIndex(int index){
        mListIndex = index;
    }
}
