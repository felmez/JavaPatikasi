package com.company;

import java.util.*;


public class MinMax {
    public static void main(String[] args) {
        int entryNumber, entryCounter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of entries you need: ");
        entryNumber = input.nextInt();

        List<Integer> entriesList = new ArrayList<>();

        for (int i = 1; i <= entryNumber; i++) {
            entryCounter++;
            System.out.print(entryCounter + ". " + "Entry ");
            int number = input.nextInt();
            entriesList.add(number);
        }

        Collections.sort(entriesList);
        System.out.println("The Minimum is " + entriesList.get(0) + "\nThe Maximum is " + entriesList.get(entriesList.size() - 1));


    }
}
