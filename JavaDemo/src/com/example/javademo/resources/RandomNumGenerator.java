package com.example.javademo.resources;

import java.util.Random;

public class RandomNumGenerator {

    public static int randomNumber() {
        Random randomNum = new Random();
        return randomNum.nextInt(0,100);
    }
}
