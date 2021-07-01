package com.company;

import java.util.*;

public class NotOrtalamasi {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, geometry, music, history;

        System.out.print("Mat Notu : ");
        math = input.nextInt();

        System.out.print("Fizik Notu : ");
        physics = input.nextInt();

        System.out.print("Kimya Notu : ");
        chemistry = input.nextInt();

        System.out.print("Geo Notu : ");
        geometry = input.nextInt();

        System.out.print("Müzik Notu : ");
        music = input.nextInt();

        System.out.print("Tarih Notu : ");
        history = input.nextInt();

        int total = math + physics + geometry + chemistry + music + history;
        double gpa = total / 6.0;
        String result = gpa > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalama = " + String.format("%.2f", gpa));
        System.out.println(result);
    }
}
