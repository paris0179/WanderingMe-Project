package com.wanderingme.wanderingme;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Aimee on 2/13/2015.
 */
public class openPhotos extends Fragment {
    public openPhotos(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.openphotos_layout,container,false);
        return rootView;
    }
}
