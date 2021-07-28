package com.company;

import java.util.*;

public class ArrayEntryMinMax {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(list);

        int number, nearestMin = list[0], nearestMax = list[list.length - 1];

        Scanner input = new Scanner(System.in);

        System.out.println(Arrays.toString(list));
        
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i : list) {
            if (i < number && i > nearestMin) {
                nearestMin = i;
            }
            if (i > number && i < nearestMax) {
                nearestMax = i;
            }
        }

        System.out.println("Minimum near value " + nearestMin);
        System.out.println("Maximum near value " + nearestMax);
    }
}
