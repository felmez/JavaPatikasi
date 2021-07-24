package com.company;
import java.util.*;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight, height, index;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in meter: ");
        height = input.nextDouble();

        System.out.print("Enter you weight in kilogram: ");
        weight = input.nextDouble();

        index = (weight / Math.pow(height, 2));
        System.out.println("Your body mass index is: " + String.format("%.2f", index));

    }
}
