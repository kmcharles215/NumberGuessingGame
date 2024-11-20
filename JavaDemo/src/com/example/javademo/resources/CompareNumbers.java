package com.example.javademo.resources;

public class CompareNumbers {
    public static void compareNumbers(int numToGuess, int numPicked) {
        String guessResult = "";
        if(numToGuess == numPicked) {
            guessResult = "You win!";
        } else if(numToGuess < numPicked) {
            guessResult = "Not quite, guess something a little lower...";
            PlayAgain.playAgain();
        } else {
            guessResult = "The number is a bit higher";
            PlayAgain.playAgain();
        }
        System.out.println(guessResult);

    }
}
