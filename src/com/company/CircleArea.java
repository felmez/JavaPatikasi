package com.company;
import java.util.*;


public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        int radius;
        double area;
        double circumference;
        double arc;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the circle radius: ");
        radius = input.nextInt();

        area = PI * Math.pow(radius, 2);
        circumference = PI * radius * 2;
        arc = (PI * Math.pow(radius, 2) * area) / 360;

        System.out.println("Circle Area is: " + area);
        System.out.println("Circle Circumference is: " + String.format("%.2f", circumference));
        System.out.println("Circle Arc Length is: " + String.format("%.2f", arc));

    }
}
