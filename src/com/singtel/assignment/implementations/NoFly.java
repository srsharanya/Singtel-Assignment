package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.FlyBehavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
