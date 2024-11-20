package com.example.javademo;

import com.example.javademo.resources.*;

import java.util.Objects;
import java.util.Scanner;

public class JavaDemo {

    public static class Main {
        public static void main(String[] args) {
            int numToGuess = RandomNumGenerator.randomNumber();
            int numPicked = GuessNumber.guessNumber();
            numPicked = CheckNumber.checkNumber(numPicked);
            CompareNumbers.compareNumbers(numToGuess, numPicked);

        }
    }
}
