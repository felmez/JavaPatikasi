package com.company;

import java.util.*;

public class Taximeter {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20;
        double start = 10;
        double min = 20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Distance (KM): ");
        km = input.nextInt();

        double total = start + (km * perKM);
        if (total < 20) {
            System.out.println("Minimum price for " + km + " km is " + min);
        } else {
            System.out.println("Price for " + km + " km is " + total);
        }

    }
}
