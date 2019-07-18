package com.singtel.assignment.model;

import com.singtel.assignment.interfaces.SwimBehaviour;

public class Fish extends Animal{ //extending animal is not necessary here

    public SwimBehaviour swimBehaviour;
    public String size = "large";
    public String color = "grey";
    public boolean isFunny = false;
    public boolean isPreyable = true;

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFunny(boolean funny) {
        isFunny = funny;
    }

    public void setPreyable(boolean preyable) {
        isPreyable = preyable;
    }

    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }
}
