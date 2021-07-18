package com.company;

import java.util.Scanner;

public class SummationOfMultiplesOfFour {
    public static void main(String[] args) {
        int number, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        } while (number % 2 == 0);

        System.out.println("Even numbers summation is: " + total);
    }
}
