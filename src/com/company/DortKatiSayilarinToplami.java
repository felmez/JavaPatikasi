package com.company;

import java.util.Scanner;

public class DortKatiSayilarinToplami {
    public static void main(String[] args) {
        int number, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir Sayi Giriniz: ");
            number = input.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        } while (number % 2 == 0);
        
        System.out.println("Girilen Cift Sayilarin Toplami: " + total);
    }
}
