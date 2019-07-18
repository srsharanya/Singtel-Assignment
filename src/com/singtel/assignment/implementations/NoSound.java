package com.singtel.assignment.implementations;

import com.singtel.assignment.interfaces.SoundBehavior;

public class NoSound implements SoundBehavior {
    @Override
    public void quack() {
        throw new UnsupportedOperationException();
    }
}
