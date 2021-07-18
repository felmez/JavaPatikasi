package com.company;

import java.util.*;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        String zodiac = "";
        int day, month;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth month: ");
        month = input.nextInt();
        System.out.print("Enter your birth day: ");
        day = input.nextInt();

        if (month == 12) {
            if (day < 22)
                zodiac = "Sagittarius / Yay";
            else
                zodiac = "Capricorn / Oglak";
        } else if (month == 1) {
            if (day < 22)
                zodiac = "Capricorn / Oglak";
            else
                zodiac = "Aquarius / Kova";
        } else if (month == 2) {
            if (day < 20)
                zodiac = "Aquarius / Kova";
            else
                zodiac = "Pisces / Balik";
        } else if (month == 3) {
            if (day < 21)
                zodiac = "Pisces / Balik";
            else
                zodiac = "Aries / Koc";
        } else if (month == 4) {
            if (day < 21)
                zodiac = "Aries / Koc";
            else
                zodiac = "Taurus / Boga";
        } else if (month == 5) {
            if (day < 22)
                zodiac = "Taurus / Boga";
            else
                zodiac = "Gemini / Ikizler";
        } else if (month == 6) {
            if (day < 23)
                zodiac = "Gemini / Ikizler";
            else
                zodiac = "Cancer / Yengec";
        } else if (month == 7) {
            if (day < 23)
                zodiac = "Cancer / Yengec";
            else
                zodiac = "Leo / Aslan";
        } else if (month == 8) {
            if (day < 23)
                zodiac = "Leo / Aslan";
            else
                zodiac = "Virgo / Basak";
        } else if (month == 9) {
            if (day < 23)
                zodiac = "Virgo / Basak";
            else
                zodiac = "Libra / Terazi";
        } else if (month == 10) {
            if (day < 23)
                zodiac = "Libra / Terazi";
            else
                zodiac = "Scorpio / Akrep";
        } else if (month == 11) {
            if (day < 22)
                zodiac = "Scorpio / Akrep";
            else
                zodiac = "Sagittarius / Yay";
        }

        System.out.println("Your zodiac sign is " + zodiac);
    }
}
