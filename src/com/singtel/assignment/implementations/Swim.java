package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.SwimBehaviour;

public class Swim implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
