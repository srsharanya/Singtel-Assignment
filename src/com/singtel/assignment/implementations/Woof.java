package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.SoundBehavior;

public class Woof implements SoundBehavior {
    @Override
    public void quack() {
        System.out.println("Woof, woof");
    }
}
