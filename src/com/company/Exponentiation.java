package com.company;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        int number, exponential, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Enter power: ");
        exponential = input.nextInt();

        for (int i = 1; i <= exponential; i++) {
            result *= number;
        }
        System.out.println("Result: " + result);
    }
}
