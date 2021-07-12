package com.company;
import java.util.*;

public class HavaDurumuEtkinlik {
    public static void main(String[] args) {
        int weatherTemperature;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Hava Sicakligini Giriniz: ");
        weatherTemperature = input.nextInt();
        if (isBetween(weatherTemperature, 5, 15)) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if (isBetween(weatherTemperature, 15, 25)) {
            System.out.println("Piknik Yapabilirsiniz");
        } else if (isBetween(weatherTemperature, 0, 5)) {
            System.out.println("Kayak Yapabilirsiniz");
        } else if (isBetween(weatherTemperature, 25, 100)) {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }

    }
    public static boolean isBetween(int degree, int lower, int upper) {
        return lower <= degree && degree <= upper;
    }
}
