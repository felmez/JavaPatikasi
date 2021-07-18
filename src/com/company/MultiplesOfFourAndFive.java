package com.company;

import java.util.Scanner;

public class MultiplesOfFourAndFive {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("Multiples of Four:");

        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Multiples of Five:");

        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}
