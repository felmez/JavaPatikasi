package com.company;

import java.util.*;

public class GradeAverage {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, geometry, music, history;

        System.out.print("Mathematics Note: ");
        math = input.nextInt();

        System.out.print("Physics Note: ");
        physics = input.nextInt();

        System.out.print("Chemistry Note: ");
        chemistry = input.nextInt();

        System.out.print("Geometry Note: ");
        geometry = input.nextInt();

        System.out.print("Music Note: ");
        music = input.nextInt();

        System.out.print("History Note: ");
        history = input.nextInt();

        int total = math + physics + geometry + chemistry + music + history;
        double gpa = total / 6.0;
        String result = gpa > 60 ? "Grade Pass" : "Grade Failed";
        System.out.println("Grade Average: " + String.format("%.2f", gpa));
        System.out.println(result);
    }
}
