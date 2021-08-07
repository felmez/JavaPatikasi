package com.company;

import java.util.Scanner;

public class PalindromicString {
    static boolean isPalindrome(String givenString) {
        int i = 0, j = givenString.length() - 1;
        while (i < j) {
            if (givenString.charAt(i) != givenString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a Palindrome.");
        } else {
            System.out.println(inputString + " is not a Palindrome.");
        }
    }
}
