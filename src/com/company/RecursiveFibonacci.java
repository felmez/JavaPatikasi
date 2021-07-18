package com.company;

import java.util.Scanner;

public class RecursiveFibonacci {
    static int findSequence(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return findSequence(n - 1) + findSequence(n - 2);
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("The fibonacci sequence of " + number + " is " + findSequence(number));
    }
}
