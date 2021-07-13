package com.company;

import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Bir Sayi Giriniz: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
            }
        }
    }
}
