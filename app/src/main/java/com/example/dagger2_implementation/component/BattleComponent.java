package com.example.dagger2_implementation.component;

import com.example.dagger2_implementation.War;

import dagger.Component;

//the component is a bridge between the generated code and the dependencies. The components also tell Dagger,
// on how the dependency needs to be injected. For that, let’s create the interface BattleComponent

@Component
public interface BattleComponent {

    War getWar();       //function getWar() is expected to return the War object so that we can use it in the appropriate place
}
