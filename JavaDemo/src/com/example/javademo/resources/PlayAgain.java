package com.example.javademo.resources;

import java.util.Scanner;

import static com.example.javademo.JavaDemo.Main.numberGuessingGame;

public class PlayAgain {
    public static void playAgain(int numToGuess){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Want to guess again? Y/N");
        String answer = scanner.nextLine();
        answer = CheckAnswer.checkAnswer(answer);
        if(answer.equalsIgnoreCase("Y")){
            numberGuessingGame(numToGuess, GuessNumber.guessNumber());
        } else {
            System.out.println("Better luck next time, thanks for playing!");
        }
    }
}
