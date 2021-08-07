package com.company;

import java.util.Scanner;

public class PalindromicNumber {
    static boolean isPalindrome(int i) {
        int tempNumber = i, reversedNumber = 0, lastDigit;

        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            tempNumber /= 10;
        }
        return i == reversedNumber;
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome.");
        } else {
            System.out.println(number + " is not a Palindrome.");
        }
    }
}
