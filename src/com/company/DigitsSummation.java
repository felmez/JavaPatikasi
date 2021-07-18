package com.company;

import java.util.Scanner;

public class DigitsSummation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int inputNumber = input.nextInt(),
                digitValue, digitsTotalValue = 0,
                digitCounter = 0;

        while (inputNumber != 0) {
            digitCounter++;
            digitValue = inputNumber % 10;
            digitsTotalValue += digitValue;
            inputNumber /= 10;
        }

        System.out.println("Digits Number: " + digitCounter + "\nDigits Summation: " + digitsTotalValue);

    }
}
