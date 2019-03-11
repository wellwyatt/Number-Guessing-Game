package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	long secretNum = Math.round(100 * Math.random());
	int userNum = 0;
	int userGuess = 0;

	Scanner keyboard = new Scanner(System.in);
	System.out.println("Guess a number between 1 - 100. ");

	    while (userNum != secretNum){
	        userGuess++;
	        userNum = keyboard.nextInt();

	        if (userNum < secretNum ){

	            System.out.println("Number is too low, Try Again!");
            }
            else if  (userNum > secretNum){

	            System.out.println("Number is too high, Tyr Again!");
            }
	        

	    }

    }
}
