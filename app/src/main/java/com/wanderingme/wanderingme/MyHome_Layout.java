package com.wanderingme.wanderingme;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.content.Intent;

import java.util.Objects;

//this class is for the class after pressing the start button in start.xml//

public class MyHome_Layout extends ActionBarActivity implements OnItemClickListener {

    private DrawerLayout dl;
    private ListView lv;

    private ActionBarDrawerToggle drawerListener;
    private Toolbar tb;
    private String[] menu;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);
        getSupportActionBar().show();

        menu = getResources().getStringArray(R.array.menu);
        dl = (DrawerLayout) findViewById(R.id.drawerLayout);
        lv = (ListView) findViewById(R.id.drawerList);

        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
        lv.setOnItemClickListener(this);

        drawerListener = new ActionBarDrawerToggle(this, dl, tb, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerClosed(View view) {
                Toast.makeText(MyHome_Layout.this, "Drawer Closed", Toast.LENGTH_SHORT).show();
                super.onDrawerClosed(view);
            }

            public void onDrawerOpened(View view) {
                Toast.makeText(MyHome_Layout.this, "Drawer Opened", Toast.LENGTH_SHORT).show();
                super.onDrawerOpened(view);
            }
        };
        dl.setDrawerListener(drawerListener);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerListener.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerListener.onOptionsItemSelected(item)) {
           // switch (item.getItemId()) {
               // case android.R.id.home:
                  //  Intent homeIntent = new Intent(this, MyHome_Layout.class);
                  //  homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                  //  startActivity(homeIntent);
           // }
            return (super.onOptionsItemSelected(item));
        }
            //return true;
            //switch (item.getItemId()) {
               // case R.id.home:
                    // app icon in action bar clicked; goto parent activity.
                    //setContentView(R.layout.home);
                    //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                    //getSupportActionBar().setHomeButtonEnabled(true);
                    //return true;
                //case R.id.profile1:
                    // app icon in action bar clicked; goto parent activity.
                   // setContentView(R.layout.profile);
                   // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                   // getSupportActionBar().setHomeButtonEnabled(true);
                   // return true;
                //default:
                    //return super.onOptionsItemSelected(item);
           // }
        //}
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerListener.syncState();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectItem(position);
    }


    //private class DrawerItemClickListener implements OnItemClickListener {
    //@Override
    //public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    //selectItem(position);
    //}
//}
    //this area is for items on the navigation bar//


    public void selectItem(int position) {


        lv.setItemChecked(position, true);
        setTitle(menu[position]);
        if (position == 0) {
            Toast.makeText(this, "This is home", Toast.LENGTH_LONG).show();
            setContentView(R.layout.home);

        }
        if (position == 1) {
            Toast.makeText(this, "This is profile", Toast.LENGTH_LONG).show();
            setContentView(R.layout.profile);

        }
        if (position == 2) {
            Toast.makeText(this, "This is photos", Toast.LENGTH_LONG).show();
            setContentView(R.layout.photos);
        }
        if (position == 3) {
            Toast.makeText(this, "This is events", Toast.LENGTH_LONG).show();
            setContentView(R.layout.events);
        }
        if (position == 4) {
            Toast.makeText(this, "This is societies", Toast.LENGTH_LONG).show();
            setContentView(R.layout.my_societies);
        }
        if (position == 5) {
            Toast.makeText(this, "This is places", Toast.LENGTH_LONG).show();
            setContentView(R.layout.places);
        }
        if (position == 6) {
            Toast.makeText(this, "This is settings", Toast.LENGTH_LONG).show();
            setContentView(R.layout.settings_page);
        }
        if (position == 7) {
            Toast.makeText(this, "This is help", Toast.LENGTH_LONG).show();
            setContentView(R.layout.help);
        }
        if (position == 8) {
            setContentView(R.layout.activity_main);

        }

        //switch (position) {
        // case 0:
        //  fragment = new openHome();
        //  break;
        //case 1:
        //  fragment = new openProfile();
        // break;
        //  case 2:
        // fragment = new openPhotos();
        // break;
        //  default:
        // break;
        //}
        // if (fragment != null) {
        //FragmentManager fragmentManager = getFragmentManager();
        // fragmentManager.beginTransaction().replace(R.id.FrameLayout1,fragment).commit();

        // lv.setItemChecked(position, true);
        // lv.setSelection(position);
        // getActionBar().setTitle(menu[position]);
        //  dl.closeDrawer(lv);
    }


    public void setTitle(String title) {

        getSupportActionBar().setTitle(title);
    }




}



