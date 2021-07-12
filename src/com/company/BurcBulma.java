package com.company;

import java.util.*;

public class BurcBulma {
    public static void main(String[] args) {
        String zodiac = "";
        int day, month;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Dogdugunuz Ayi Giriniz: ");
        month = input.nextInt();
        System.out.print("Lutfen Dogdugunuz Gunu Giriniz: ");
        day = input.nextInt();

        if (month == 12) {
            if (day < 22)
                zodiac = "Yay";
            else
                zodiac = "Oglak";
        } else if (month == 1) {
            if (day < 22)
                zodiac = "Oglak";
            else
                zodiac = "Kova";
        } else if (month == 2) {
            if (day < 20)
                zodiac = "Kova";
            else
                zodiac = "Balik";
        } else if (month == 3) {
            if (day < 21)
                zodiac = "Balik";
            else
                zodiac = "Koc";
        } else if (month == 4) {
            if (day < 21)
                zodiac = "Koc";
            else
                zodiac = "Boga";
        } else if (month == 5) {
            if (day < 22)
                zodiac = "Boga";
            else
                zodiac = "Ikizler";
        } else if (month == 6) {
            if (day < 23)
                zodiac = "Ikizler";
            else
                zodiac = "Yengec";
        } else if (month == 7) {
            if (day < 23)
                zodiac = "Yengec";
            else
                zodiac = "Aslan";
        } else if (month == 8) {
            if (day < 23)
                zodiac = "Aslan";
            else
                zodiac = "Basak";
        } else if (month == 9) {
            if (day < 23)
                zodiac = "Basak";
            else
                zodiac = "Terazi";
        } else if (month == 10) {
            if (day < 23)
                zodiac = "Terazi";
            else
                zodiac = "Akrep";
        } else if (month == 11) {
            if (day < 22)
                zodiac = "Akrep";
            else
                zodiac = "Yay";
        }

        System.out.println("Burcunuz " + zodiac);
    }
}
