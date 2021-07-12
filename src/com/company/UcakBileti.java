package com.company;

import java.util.Scanner;


public class UcakBileti {
    public static void main(String[] args) {
        double distance;
        double initialPricePerKM = 0.1, roundTripDiscountRate = 0.2, youngDiscountRate = 0.1, oldDiscountRate = 0.3, childDiscountRate = 0.5;
        int age, type;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen Mesafeyi KM Cinsinden Giriniz: ");
        distance = input.nextDouble();

        System.out.print("Lutfen Yolcunun Yasini Giriniz: ");
        age = input.nextInt();

        System.out.print("Lutfen Yolculugun Tipiniz Seciniz: \n 1- Tek Yon \n 2- Gidis Donus \n");
        type = input.nextInt();

        double totalPrice = distance * initialPricePerKM;
        double discountedPrice;

        if (distance < 0 || age < 0 || type < 0 || type > 2) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            if (type == 2) {
                discountedPrice = totalPrice - (totalPrice * roundTripDiscountRate);
                if (age >= 12 && age <= 24) {
                    discountedPrice = discountedPrice - (discountedPrice * youngDiscountRate);
                    System.out.println("Genc Indirimli Gidis Donus Toplam Tutar: " + (discountedPrice * 2));
                } else if (age < 12) {
                    discountedPrice = discountedPrice - (discountedPrice * childDiscountRate);
                    System.out.println("Cocuk Indirimli Gidis Donus Toplam Tutar: " + (discountedPrice * 2));
                } else if (age > 65) {
                    discountedPrice = discountedPrice - (discountedPrice * oldDiscountRate);
                    System.out.println("65 Yas Ustu Indirimli Gidis Donus Toplam Tutar: " + (discountedPrice * 2));
                } else {
                    System.out.println("Gidis Donus Indirimli Toplam Tutar: " + (discountedPrice * 2));
                }
            } else {
                discountedPrice = totalPrice;
                if (age >= 12 && age <= 24) {
                    discountedPrice = discountedPrice - (discountedPrice * youngDiscountRate);
                    System.out.println("Genc Indirimli Toplam Tutar: " + discountedPrice);
                } else if (age < 12) {
                    discountedPrice = discountedPrice - (discountedPrice * childDiscountRate);
                    System.out.println("Cocuk Indirimli Toplam Tutar: " + discountedPrice);
                } else if (age > 65) {
                    discountedPrice = discountedPrice - (discountedPrice * oldDiscountRate);
                    System.out.println("65 Yas Ustu Indirimli Toplam Tutar: " + discountedPrice);
                } else {
                    System.out.println("Toplam Tutar: " + discountedPrice);
                }
            }
        }

    }
}
