package com.company;

import java.util.*;

public class GradePassOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math, physics, chemistry, turkish, music, average;

        System.out.print("Mathematics Note: ");
        math = input.nextDouble();
        math = isCountable(math);

        System.out.print("Physics Note: ");
        physics = input.nextDouble();
        physics = isCountable(physics);

        System.out.print("Chemistry Note: ");
        chemistry = input.nextDouble();
        chemistry = isCountable(chemistry);


        System.out.print("Turkish Note: ");
        turkish = input.nextDouble();
        turkish = isCountable(turkish);

        System.out.print("Music Note: ");
        music = input.nextDouble();
        music = isCountable(music);


        average = (math + physics + chemistry + turkish + music) / 5.0;

        if (average >= 55) {
            System.out.println("Grade Pass");
        } else {

            System.out.println("Grade Failed");
        }
        System.out.println("Grade Average " + average);
    }

    public static double isCountable(double score) {
        if (score >= 0 && score <= 100) {
            return score;
        }
        return 0;
    }
}
