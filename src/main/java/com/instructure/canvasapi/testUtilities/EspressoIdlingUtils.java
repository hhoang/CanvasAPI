package com.instructure.canvasapi.testUtilities;

public class EspressoIdlingUtils {

    private static EspressoIdlingListener mIdlingListenerInstance = new DefaultIdlingListener();

    public static void incrementCounter(){
        getInstance().incrementCounter();
    }

    public static void decrementCounter(){
        getInstance().decrementCounter();
    }

    public static void setIdlingListener(EspressoIdlingListener canvasListener){
        mIdlingListenerInstance = canvasListener;
    }

    public static EspressoIdlingListener getInstance() {
        return mIdlingListenerInstance;
    }
}
