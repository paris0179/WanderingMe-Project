package com.wanderingme.wanderingme;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Aimee on 2/13/2015.
 */
public class openHome extends Fragment {
    public openHome(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.openhome_layout,container,false);
        return rootView;
    }
}
