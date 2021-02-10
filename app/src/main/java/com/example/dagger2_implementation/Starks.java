package com.example.dagger2_implementation;

import android.util.Log;

import javax.inject.Inject;

public class Starks {

    //The plan is to make the dependency Starks inject into the Class War.
    // So we need to tell Dagger 2 that these are the dependencies that need to be injected
    @Inject
    public Starks() {
        Log.e("MyWAR", "Starks");
    }
}
