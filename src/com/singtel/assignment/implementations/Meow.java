package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.SoundBehavior;

public class Meow implements SoundBehavior {
    @Override
    public void quack() {
        System.out.println("Meow, meow");
    }
}
