package com.company;

import java.util.*;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int length = input.nextInt();

        int[] list = new int[length];
        int counter = 1;

        for (int i = 0; i < list.length; i++) {
            System.out.print(counter + ". Element: ");
            int element = input.nextInt();
            list[i] = element;
            counter++;
        }

        Arrays.sort(list);
        System.out.println("Sorted Array: " + Arrays.toString(list));

    }
}
