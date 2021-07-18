package com.company;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        double first, second, result = 0;
        int selection;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        first = input.nextDouble();

        System.out.print("Enter the second number: ");
        second = input.nextDouble();

        System.out.println("Please select an operation: \n1-+\n2--\n3-*\n4-/");
        selection = input.nextInt();

        switch (selection) {
            case 1:
                result = first + second;
                System.out.println(result);
                break;
            case 2:
                result = first - second;
                System.out.println(result);
                break;
            case 3:
                result = first * second;
                System.out.println(result);
                break;
            case 4:
                if (second != 0) {
                    result = first / second;
                    System.out.println(result);
                } else {
                    System.out.println("Zero Division Error");
                }
                break;
            default:
                System.out.println("Wrong Selection or Input.");
                break;
        }
    }
}
