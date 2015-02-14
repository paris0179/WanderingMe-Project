package com.wanderingme.wanderingme;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Aimee on 2/13/2015.
 */
public class openProfile extends Fragment {
    public openProfile(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.openprofile_layout,container,false);
        return rootView;
    }
}
