package com.example.javademo.resources;

import com.example.javademo.JavaDemo;

public class CheckNumber {
    public static int checkNumber(int numPicked){
        //Checks if the number the user entered is between 1 - 100
        if(numPicked > 100 || numPicked < 0) {
            System.out.println("The number you pick must be between 1 - 100, guess again.");
            numPicked = GuessNumber.guessNumber();
            checkNumber(numPicked);
        }return numPicked;
    }
}
