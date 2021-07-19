package com.company;

import java.util.Scanner;

public class RecursiveMethod {
    static String minusFive(int i) {
        if (i > 0) {
            return i + " " + minusFive(i - 5) + " " + i;
        }
        return i + "";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = input.nextInt();

        System.out.println(minusFive(inputNumber));

    }
}
