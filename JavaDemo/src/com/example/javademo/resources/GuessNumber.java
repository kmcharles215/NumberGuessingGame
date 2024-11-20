package com.example.javademo.resources;

import java.util.Scanner;

public class GuessNumber {
    public static int guessNumber(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number from 0 thru 100");
        return scanner.nextInt();
    }
}
