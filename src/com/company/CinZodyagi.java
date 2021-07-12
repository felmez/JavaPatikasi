package com.company;

import java.util.*;

public class CinZodyagi {
    public static void main(String[] args) {
        int year, sign;

        List<String> zodiac = Arrays.asList("Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun");

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum Yilinizi Giriniz: ");
        year = input.nextInt();

        sign = year % 12;
        System.out.println("Cin Zodyagi Burcunuz: " + zodiac.get(sign));
    }
}
