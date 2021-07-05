package com.company;
import java.util.*;


public class DaireAlani {
    public static void main(String[] args) {
        final double PI = 3.14;
        int radius;
        double area;
        double circumference;
        double arc;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yaricapini Giriniz: ");
        radius = input.nextInt();
        area = PI * Math.pow(radius, 2);
        circumference = PI * radius * 2;
        arc = (PI * Math.pow(radius, 2) * area) / 360;
        System.out.println("Dairenin Alani: " + area);
        System.out.println("Dairenin Cevresi: " + String.format("%.2f", circumference));
        System.out.println("Yay Alani: " + String.format("%.2f", arc));

    }
}
