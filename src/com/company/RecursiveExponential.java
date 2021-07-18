package com.company;

import java.util.Scanner;

public class RecursiveExponential {
    static int power(int base, int exponent) {
        if (exponent != 0) {
            return (base * power(base, exponent - 1));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int base, exponent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        base = input.nextInt();

        System.out.print("Enter power: ");
        exponent = input.nextInt();

        int result = power(base, exponent);
        System.out.println("Result: " + result);

    }
}
