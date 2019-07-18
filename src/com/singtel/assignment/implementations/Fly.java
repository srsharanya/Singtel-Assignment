package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.FlyBehavior;

public class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
