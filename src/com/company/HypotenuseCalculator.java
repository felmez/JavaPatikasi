package com.company;

import java.util.*;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Side A: ");
        a = input.nextInt();

        System.out.print("Enter Side B: ");
        b = input.nextInt();

        System.out.print("Enter Side C: ");
        c = input.nextInt();

        int perimeter = (a + b + c) / 2;
        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));

        System.out.println("Area is: " + String.format("%.2f", area));
    }
}
