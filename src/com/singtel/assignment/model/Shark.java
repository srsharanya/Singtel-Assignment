package com.singtel.assignment.model;

import com.singtel.assignment.implementations.Swim;
import com.singtel.assignment.interfaces.SwimBehaviour;

public class Shark extends Fish {

    @Override
    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        super.setSwimBehaviour(new Swim());
    }


}
