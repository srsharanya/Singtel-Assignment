package com.singtel.assignment.model;

import com.singtel.assignment.interfaces.FlyBehavior;
import com.singtel.assignment.interfaces.SoundBehavior;
import com.singtel.assignment.interfaces.SwimBehaviour;

public class Bird extends Animal implements Cloneable {

    private FlyBehavior flyBehavior;
    private SoundBehavior quackBehavior;
    private SwimBehaviour swimBehaviour;

    public Bird() {
    }

    public Bird(FlyBehavior flyBehavior, SoundBehavior quackBehavior, SwimBehaviour swimBehaviour) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.swimBehaviour = swimBehaviour;
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performSwim(){
       swimBehaviour.swim();
    };
    public void performSing(){
        System.out.println("I am singing");
    };

    @Override
    public Bird clone() throws CloneNotSupportedException {
        return (Bird)super.clone();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }
}
