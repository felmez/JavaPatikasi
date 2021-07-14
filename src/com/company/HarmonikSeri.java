package com.company;
import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int number;
        double result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz: ");
        number = input.nextInt();

        for (double i = 1.0; i <= number; i++) {
            result += 1/i;
        }

        System.out.println("Sonuc: " + String.format("%.2f", result));
    }
}
