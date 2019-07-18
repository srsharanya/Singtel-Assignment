package com.singtel.assignment;

import com.singtel.assignment.implementations.*;
import com.singtel.assignment.model.*;


import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException {

        //we have 2 special kinds of birds: the Duck and the Chicken...
        Bird duck    = new Bird(new NoFly(), new Quack(), new Swim());
        Bird chicken = new Bird(new NoFly(), new Cluck(), new NoSwim());

        //Now how would you com.model a rooster?
        Bird rooster = new Bird(new NoFly(), new Cock(), new NoSwim());

        Bird parrot_lives_near_dog     = new Bird(new NoFly(), new Woof(), new NoSwim());
        Bird parrot_lives_near_cat     = new Bird(new NoFly(), new Meow(), new NoSwim());
        Bird parrot_lives_near_rooster = new Bird(new NoFly(), new Cock(), new NoSwim());
        Bird parrot_lives_near_duck    = new Bird(new NoFly(), new Quack(), new Swim());

        //Dolphins are not exactly fish, yet, they are good swimmers
        Fish dolphin = new Fish();
        dolphin.setSwimBehaviour(new Swim());

        //Can you com.model a butterfly?
        Bird butterfly = new Bird(new Fly(), new NoSound(), new NoSwim());

        //Can you optimize your com.model to account for the metamorphosis from caterpillar to butterfly?
        Bird caterpillar = butterfly.clone();
        caterpillar.setFlyBehavior(new NoFly());

        //Counting animals
        Animal[] animals = new Animal[]{
                new Bird(),
                duck,
                chicken,
                rooster,
                parrot_lives_near_dog,
                new Fish(),
                new Shark(),
                new Clownfish(),
                dolphin,
                new Animal() {},
                new Animal() {},
                butterfly,
        };

        int singable = (int) Arrays.stream(animals).filter(animal -> animal instanceof Bird).count();
        int walkable = animals.length;

        final AtomicInteger flyable =  new AtomicInteger(1);
        final AtomicInteger swimmable =  new AtomicInteger(1);

        Arrays.stream(animals).filter(animal -> animal instanceof Bird).forEach(bird->{
            Bird b = (Bird)bird;
            if(b.getFlyBehavior() instanceof Fly){
                flyable.getAndIncrement();
            }
            if(b.getSwimBehaviour() instanceof Swim){
                swimmable.getAndIncrement();
            }
        });

        Arrays.stream(animals).filter(animal -> animal instanceof Fish).forEach(fish->{
            Fish b = (Fish)fish;
            if(b.getSwimBehaviour() instanceof Swim){
                swimmable.getAndIncrement();
            }
        });

        System.out.println("singable: "+ singable);
        System.out.println("walkable: "+ walkable);
        System.out.println("swimmable: "+ swimmable);
        System.out.println("flyable: "+ flyable);

    }
}
