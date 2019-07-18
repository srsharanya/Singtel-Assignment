package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.SoundBehavior;

public class Quack implements SoundBehavior {
    @Override
    public void quack() {
        System.out.println("Quack, quack");
    }
}
