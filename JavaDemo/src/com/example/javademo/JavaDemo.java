package com.example.javademo;

import com.example.javademo.resources.*;

public class JavaDemo {

    public static class Main {
        public static void main(String[] args) {
            int numToGuess = RandomNumGenerator.randomNumber();
            int numPicked = GuessNumber.guessNumber();
            numberGuessingGame(numToGuess, numPicked);
        }

        public static void numberGuessingGame(int numToGuess, int numPicked) {
            numPicked = CheckNumber.checkNumber(numPicked);
            CompareNumbers.compareNumbers(numToGuess, numPicked);
        }
    }
}
