package com.example.javademo.resources;

import java.util.Random;

public class RandomNumGenerator {

    public static int randomNumber() {
        Random randomNum = new Random();
        int rand = randomNum.nextInt(0,100);
        return rand;
    }
}
