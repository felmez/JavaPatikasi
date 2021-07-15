package com.company;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int sequenceNumber, firstNumber = 0, secondNumber = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter fibonacci sequence items number: ");
        sequenceNumber = input.nextInt();

        if (sequenceNumber < 1) {
            return;
        }

        System.out.print(firstNumber + " ");

        for (int i = 1; i <= sequenceNumber; i++) {
            System.out.print(secondNumber + " ");
            int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
        }
    }
}
