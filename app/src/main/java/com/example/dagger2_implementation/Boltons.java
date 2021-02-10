package com.example.dagger2_implementation;

import android.util.Log;

import javax.inject.Inject;

public class Boltons {

    //The plan is to make the dependency Boltons inject into the Class War.
    // So we need to tell Dagger 2 that these are the dependencies that need to be injected
    @Inject
    public Boltons() {
        Log.e("MyWAR", "Boltons");
    }
}
