package com.company;

import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Random randomness = new Random();
        int randomNumber = randomness.nextInt(100);

        Scanner input = new Scanner(System.in);
        int attempts = 0;
        int inputNumber;
        int[] wrongGuesses = new int[5];
        boolean isWon = false;
        boolean isWrong = false;

        while (attempts < 5) {
            System.out.print("Enter your guess: ");
            inputNumber = input.nextInt();

            if (inputNumber < 0 || inputNumber > 99) {
                System.out.println("Your guess must be between 0 and 100.");
                if (isWrong) {
                    attempts++;
                    System.out.println("Too much wrong guesses. Remaining attempts: " + (5 - attempts));
                } else {
                    isWrong = true;
                    System.out.println("Your next wrong guess will be deducted.");
                }
                continue;
            }

            if (inputNumber == randomNumber) {
                System.out.println("Wow, you got it! Your guess is: " + randomNumber);
                isWon = true;
                break;
            } else {
                System.out.println("Wrong guess!");

                if (inputNumber > randomNumber) {
                    System.out.println(inputNumber + " is bigger that the number.");
                } else {
                    System.out.println(inputNumber + " is smaller that the number.");
                }

                wrongGuesses[attempts++] = inputNumber;
                System.out.println("Remaining attempts: " + (5 - attempts));
            }
        }

        if (!isWon) {
            System.out.println("You lost!");
            System.out.println("The number was " + randomNumber);
            if (!isWrong) {
                System.out.println("Your guesses: " + Arrays.toString(wrongGuesses));
            }
        }
    }
}
