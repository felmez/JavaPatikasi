package com.company;

import java.util.Scanner;

public class TriangleStarPattern {
    public static void main(String[] args) {
        int numberOfLines;
        String symbol;
        char space = ' ';

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number of Lines: ");
        numberOfLines = input.nextInt();

        System.out.print("Enter The Symbol to Print: ");
        symbol = input.next();

        for (int i = numberOfLines; i > 0; i--) {
            for (int j = 1; j <= (numberOfLines - i); j++) {
                System.out.print(space);
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
