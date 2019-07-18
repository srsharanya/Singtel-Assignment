package com.singtel.assignment.test;

import com.singtel.assignment.model.Bird;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class BirdTest {
    @Test
    public void test(){
        Class<Bird> birdClass = Bird.class;
        Method[] methods = birdClass.getDeclaredMethods();
        boolean exists = Arrays.stream(methods).filter(method ->method.getName().equals("performSing")).findAny().isPresent();
        Assert.assertTrue(exists);

    }
}

