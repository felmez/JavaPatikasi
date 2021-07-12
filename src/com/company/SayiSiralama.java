package com.company;

import java.util.*;

public class SayiSiralama {
    public static void main(String[] args) {
        int first, second, third;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayiyi Giriniz: ");
        first = input.nextInt();

        System.out.print("2. Sayiyi Giriniz: ");
        second = input.nextInt();

        System.out.print("3. Sayiyi Giriniz: ");
        third = input.nextInt();

        sortNumbers(first, second, third);
    }

    public static void sortNumbers(int a, int b, int c) {
        if ((a < b) && (b < c)) {
            System.out.println("Siralama -> " + a + " " + b + " " + c);
        }
        if ((a < b) && (b > c)) {
            System.out.println("Siralama -> " + a + " " + c + " " + b);
        }
        if ((a > b) && (b > c)) {
            System.out.println("Siralama -> " + c + " " + b + " " + a);
        }
        if ((a > b) && (b < c)) {
            System.out.println("Siralama -> " + b + " " + a + " " + c);
        }
    }
}
