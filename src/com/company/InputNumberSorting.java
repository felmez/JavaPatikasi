package com.company;

import java.util.*;

public class InputNumberSorting {
    public static void main(String[] args) {
        int first, second, third;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = input.nextInt();

        System.out.print("Enter the second number: ");
        second = input.nextInt();

        System.out.print("Enter the third number: ");
        third = input.nextInt();

        sortNumbers(first, second, third);
    }

    public static void sortNumbers(int a, int b, int c) {
        if ((a < b) && (b < c)) {
            System.out.println("Sorted Input -> " + a + " " + b + " " + c);
        }
        if ((a < b) && (b > c)) {
            System.out.println("Sorted Input -> " + a + " " + c + " " + b);
        }
        if ((a > b) && (b > c)) {
            System.out.println("Sorted Input -> " + c + " " + b + " " + a);
        }
        if ((a > b) && (b < c)) {
            System.out.println("Sorted Input -> " + b + " " + a + " " + c);
        }
    }
}
