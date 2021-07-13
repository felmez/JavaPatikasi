package com.company;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayisi Giriniz: ");
        int n = input.nextInt();
        System.out.print("R Sayisi Giriniz: ");
        int r = input.nextInt();
        int result = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Sonuc: " + result);

    }

    static int factorial(int number) {
        int f = 1;
        int j = 1;
        while (j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }
}
