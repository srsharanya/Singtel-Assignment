package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.SoundBehavior;

public class Cluck implements SoundBehavior {
    @Override
    public void quack() {
        System.out.println("Cluck, cluck");
    }
}
