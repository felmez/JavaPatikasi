package com.company;

import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz: ");
        number = input.nextInt();
        System.out.println("Dordun Kuvveti -----");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Besin Kuvveti -----");
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}
