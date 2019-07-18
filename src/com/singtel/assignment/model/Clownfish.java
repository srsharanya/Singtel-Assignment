package com.singtel.assignment.model;

import com.singtel.assignment.implementations.Swim;
import com.singtel.assignment.interfaces.SwimBehaviour;

public class Clownfish extends Fish{

    @Override
    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        super.setSwimBehaviour(new Swim());
    }

    @Override
    public void setSize(String size) {
        super.setSize("small");
    }

    @Override
    public void setColor(String color) {
        super.setColor("colorful");
    }

    @Override
    public void setFunny(boolean funny) {
        super.setFunny(true);
    }

    @Override
    public void setPreyable(boolean preyable) {
        super.setPreyable(false);
    }
}
