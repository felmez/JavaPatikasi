package com.company;

import java.util.Scanner;

public class AdvancedCalculator {
    static void addition() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of operands: ");
        int counter = scan.nextInt();

        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            number = scan.nextInt();

            if (i == 1) {
                result += number;
                continue;
            }

            result += number;
        }

        System.out.println("Result: " + result);
    }

    static void subtraction() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of operands: ");
        int counter = scan.nextInt();

        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }

            result -= number;
        }

        System.out.println("Result: " + result);
    }

    static void multiplication() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of operands: ");
        int counter = scan.nextInt();

        int number, result = 1;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            number = scan.nextInt();

            if (number == 0) {
                result = 0;
                break;
            }

            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void division() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of operands: ");
        int counter = scan.nextInt();

        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number: ");
            number = scan.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("Zero Division Error.");
                continue;
            }

            if (i == 1) {
                result = number;
                continue;
            }

            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int base = scan.nextInt();

        System.out.print("Enter power: ");
        int exponent = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void modulo() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Dividend: ");
        int dividend = scan.nextInt();

        System.out.print("Enter the Divisor: ");
        int divisor = scan.nextInt();

        int result = dividend % divisor;

        System.out.println("Result: " + result);
    }

    static void rectangleArea() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter L (Length): ");
        int length = scan.nextInt();

        System.out.print("Enter W (Width): ");
        int width = scan.nextInt();

        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Rectangle Area: " + area + "\nRectangle Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponent Calculation\n"
                + "6- Factorial\n"
                + "7- Modulo\n"
                + "8- Rectangle Area and Perimeter\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            selection = scan.nextInt();
            
            switch (selection) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulo();
                    break;
                case 8:
                    rectangleArea();
                    break;
                case 0:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Wrong selection, please try again.");
            }
        } while (selection != 0);
    }
}
