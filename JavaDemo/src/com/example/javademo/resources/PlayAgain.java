package com.example.javademo.resources;

import java.util.Scanner;

public class PlayAgain {
    public static String playAgain(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Want to guess again? Y/N");
        String answer = scanner.nextLine();
        CheckAnswer.checkAnswer(answer);
        return answer;

    }
}
