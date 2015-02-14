package com.wanderingme.wanderingme;

/**
 * Created by Aimee on 2/13/2015.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MySimpleArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public MySimpleArrayAdapter(Context context, String[] values){
        super(context, R.layout.row,values);
        this.context=context;
        this.values=values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View r;

        if(convertView==null) {
            LayoutInflater i = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            r = inflater.inflate(R.layout.row, parent, false);
        }else{
            r = convertView;
        }

        TextView t = (TextView)r.findViewById(R.id.textView);
        ImageView i = (ImageView)r.findViewById(R.id.imageView);
        t.setText(values[position]);
        String s = (values[position]);

        if(s.startsWith("VSCO")){
            i.setImageResource(R.drawable.vsco);
        }
        if(s.startsWith("Royal Photographics")){
            i.setImageResource(R.drawable.rps);
        }
        if(s.startsWith("The Cube")){
            i.setImageResource(R.drawable.cube);
        }
        if(s.startsWith("Photographic Society")){
            i.setImageResource(R.drawable.shadow);
        }
        if(s.startsWith("Socality")) {
            i.setImageResource(R.drawable.socality);
        }
        return r;
    }
}





