package com.instructure.canvasapi.testUtilities;

import android.util.Log;

/**
 * Created by hhoang on 2/24/16.
 */
public class DefaultIdlingListener implements EspressoIdlingListener {

    public DefaultIdlingListener(){}

    @Override
    public void incrementCounter(){
        Log.d("hoa", "incrementCounter shouldn't be called");
    }

    @Override
    public void decrementCounter(){
        Log.d("hoa", "decrementCounter shouldn't be called");
    }
}
