package com.company;

import java.util.*;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math, physics, chemistry, turkish, music, average;

        System.out.print("Mat Notu Giriniz: ");
        math = input.nextInt();
        math = isCountable(math);

        System.out.print("Fizik Notu Giriniz: ");
        physics = input.nextInt();
        physics = isCountable(physics);

        System.out.print("Kimya Notu Giriniz ");
        chemistry = input.nextInt();
        chemistry = isCountable(chemistry);

        System.out.print("Türkçe Notu Giriniz: ");
        turkish = input.nextInt();
        turkish = isCountable(turkish);

        System.out.print("Müzik Notu Giriniz: ");
        music = input.nextInt();
        music = isCountable(music);

        average = (math + physics + chemistry + turkish + music) / 5;

        if (average >= 55) {
            System.out.println("Sinifi Gectiniz");
        }
        else {

            System.out.println("Sinifta Kaldiniz");
        }
        System.out.println("Ortalamaniz " + average);
    }
    public static double isCountable(double score) {
        if (score >= 0 && score <= 100) {
            return score;
        }
        return 0;
    }
}
