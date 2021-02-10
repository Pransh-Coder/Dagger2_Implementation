package com.example.dagger2_implementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2_implementation.component.BattleComponent;
import com.example.dagger2_implementation.component.DaggerBattleComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Boltons boltons = new Boltons();
        Starks starks = new Starks();

        War war = new War(boltons,starks);      // this is a manual dependency Injection  becoz war class is dependent upon Boltons and Starks*/

        //After rebuilding, the Dagger 2 would have generated the class called DaggerBattleComponent  (Just append Dagger keyword infront of Interface name)
        //this will help us inject the War object. Now, let’s use this class to get the War instance.

        BattleComponent battleComponent = DaggerBattleComponent.create();
        War war = battleComponent.getWar();         //since we created an object of War class now we can use any method of WAR class
        war.proceedToNorth();

        //Using DaggerBattleComponent class, we’re now able to use the method getWar(), where this method,
        // returns the object War, which feeds the dependencies — Starks and Boltons.


    }
}