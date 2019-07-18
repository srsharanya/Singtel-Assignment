package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.SwimBehaviour;

public class NoSwim implements SwimBehaviour {
    @Override
    public void swim() {
       throw new UnsupportedOperationException();
    }
}
