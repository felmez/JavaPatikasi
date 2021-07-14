package com.company;

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        int firstNumber, secondNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        secondNumber = input.nextInt();

        int tempFirstNumber = firstNumber, tempSecondNumber = secondNumber;
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber -= secondNumber;
            } else {
                secondNumber -= firstNumber;
            }
        }

        int greatCommonDivisor = firstNumber, leastCommonMultiple = (tempFirstNumber * tempSecondNumber) / greatCommonDivisor;

        System.out.println("The Greatest Common Divisor is: " + greatCommonDivisor + "\n" + "The Least Common Multiple is: " + leastCommonMultiple);

    }
}
