package com.company;
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int number, exponential, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz: ");
        number = input.nextInt();

        System.out.print("Us Sayisi Giriniz: ");
        exponential = input.nextInt();

        for (int i = 1; i <= exponential; i++) {
            result *= number;
        }
        System.out.println("Sonuc: " + result);
    }
}
