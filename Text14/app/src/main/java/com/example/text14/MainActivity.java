package com.example.text14;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int mCurrentOrientation = getResources().getConfiguration().orientation;

        if ( mCurrentOrientation == Configuration.ORIENTATION_PORTRAIT ) {

            // If current screen is portrait

            setContentView(R.layout.activity_main);

        } else if ( mCurrentOrientation == Configuration.ORIENTATION_LANDSCAPE ) {

            //If current screen is landscape

            setContentView(R.layout.layout_land);

        }

    }

    public void onConfigurationChanged(Configuration newConfig) {

    }
}
