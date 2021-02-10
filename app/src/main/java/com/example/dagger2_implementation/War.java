package com.example.dagger2_implementation;

import android.util.Log;

import javax.inject.Inject;

public class War {

    private Boltons boltons;
    private Starks starks;

    //These two dependencies boltons and starks, go to the Class War. Hence we need to mark it as inject in the War class constructor as well
    @Inject                 //constructor Injection
    public War(Boltons boltons, Starks starks) {
        this.boltons = boltons;
        this.starks = starks;
        Log.e("MyWAR", "War");
    }

    public void proceedToNorth(){
        Log.e("MyWAR", "proceedToNorth func called from War object");
    }
}
