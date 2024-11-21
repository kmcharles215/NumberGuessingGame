package com.example.javademo.resources;

import java.util.Scanner;

public class CheckAnswer {
    public static String checkAnswer(String answer) {
        //Checks if the user inputted a valid answer and if they want to guess again.
        answer = answer.toUpperCase();
        Scanner scanner = new Scanner(System.in);
        if(!answer.equals("Y") && !answer.equals("N")){
            System.out.println("Invalid entry, please enter 'Y' for yes " +
                    "or 'N' for no.");
            System.out.println("Want to guess again? Y/N");
            answer = scanner.nextLine();
            checkAnswer(answer);
        }
        return answer;
    }
}
