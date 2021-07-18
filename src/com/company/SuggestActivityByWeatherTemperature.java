package com.company;

import java.util.*;

public class SuggestActivityByWeatherTemperature {
    public static void main(String[] args) {
        int weatherTemperature;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weather temperature: ");
        weatherTemperature = input.nextInt();

        if (isBetween(weatherTemperature, 5, 15)) {
            System.out.println("You can go to cinema.");
        } else if (isBetween(weatherTemperature, 15, 25)) {
            System.out.println("You can have a picnic.");
        } else if (isBetween(weatherTemperature, 0, 5)) {
            System.out.println("You can go skiing.");
        } else if (isBetween(weatherTemperature, 25, 100)) {
            System.out.println("You can go swimming.");
        }

    }

    public static boolean isBetween(int degree, int lower, int upper) {
        return lower <= degree && degree <= upper;
    }
}
