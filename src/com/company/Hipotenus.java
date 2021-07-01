package com.company;
import java.util.*;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("A Kenari Giriniz : ");
        a = input.nextInt();
        System.out.print("B Kenari Giriniz : ");
        b = input.nextInt();
        System.out.print("C Kenari Giriniz : ");
        c = input.nextInt();
        double p = (a + b + c)/2;
        double alan = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Alan = " + String.format("%.2f", alan));
    }
}
