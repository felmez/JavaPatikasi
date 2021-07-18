package com.company;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        System.out.print("Enter R: ");
        int r = input.nextInt();

        int result = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Combination Result is " + result);

    }

    static int factorial(int number) {
        int f = 1;
        int j = 1;
        while (j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }
}
