package com.harkerutils.bellschedule;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/*
Main activity panel for the Android Application

Contains two methods:
    onCreate(Bundle savedInstanceState)
    onCreateOptionsMenu(Menu menu)

Usage: create the menu for the application and set up runtime
TODO: Link to the bellschedule UI
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
