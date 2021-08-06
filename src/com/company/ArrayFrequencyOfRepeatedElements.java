package com.company;

import java.util.*;

public class ArrayFrequencyOfRepeatedElements {
    public static void countFrequency(int[] array, int arrayLength) {
        boolean[] scanned = new boolean[arrayLength];
        Arrays.fill(scanned, false);

        for (int i = 0; i < arrayLength; i++) {
            if (scanned[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i] == array[j]) {
                    scanned[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Number " + array[i] + " is repeated " + count + " times.");
            } else {
                System.out.println("Number " + array[i] + " is repeated " + count + " time.");
            }
        }

    }

    public static void main(String[] args) {
        int[] givenArray = new int[]{10, 20, 20, 10, 10, 20, 5, 20, 30};

        System.out.println("Array: " + Arrays.toString(givenArray));
        System.out.println("\nRepeated numbers with their frequency:");

        countFrequency(givenArray, givenArray.length);
    }
}
