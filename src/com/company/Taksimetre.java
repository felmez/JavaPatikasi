package com.company;
import java.util.*;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKM = 2.20;
        double start = 10;
        double min = 20;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz (KM): ");
        km = input.nextInt();
        double toplam = start + (km * perKM);
        if (toplam < 20) {
            System.out.println(km +" kilometre icin " + "minimum odenecek tutar = " + min);
        }
        else {
            System.out.println(km +" kilometre icin " + "odenecek Tutar = " + toplam);
        }

    }
}
