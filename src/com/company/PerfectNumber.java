package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number, result = 0, factor = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (factor <= number / 2) {
            if (number % factor == 0) {
                result += factor;
            }
            factor++;
        }

        if (result == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

    }
}
