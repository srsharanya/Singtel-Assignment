package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.SoundBehavior;

public class Cock implements SoundBehavior {
    @Override
    public void quack() {
        System.out.println("Cock-a-doodle-doo");
    }
}