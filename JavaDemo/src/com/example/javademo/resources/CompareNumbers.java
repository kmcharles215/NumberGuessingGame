package com.example.javademo.resources;

public class CompareNumbers {
    public static void compareNumbers(int numToGuess, int numPicked) {
        if(numToGuess == numPicked) {
            System.out.println("You win!");
        } else if(numToGuess < numPicked) {
            System.out.println("Not quite, guess something a little lower...");
            PlayAgain.playAgain(numToGuess);
        } else {
            System.out.println("The number is a bit higher");
            PlayAgain.playAgain(numToGuess);
        }

    }
}
