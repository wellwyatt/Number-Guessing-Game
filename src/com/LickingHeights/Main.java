package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long secretNum = Math.round(100 * Math.random());
        int userNum = 0;
        int userGuesses = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number between 1 - 100. ");

        while (userNum != secretNum) {
            userGuesses++;
            userNum = keyboard.nextInt();

            if (userNum < secretNum) {
                System.out.println("Too low, Try Again!");
            } else if (userNum > secretNum) {
                System.out.println("Too high, Try Again!");
            }



        }
        System.out.println("You got it! It Took " + userGuesses + " guesses to find it.");
    }
}
