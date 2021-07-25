package com.company;

public class ArrayHarmonicMean {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double harmonicSeries = 0.0;
        double harmonicMean;

        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += 1 / numbers[i];
        }

        harmonicMean = numbers.length / harmonicSeries;

        System.out.println("Array items harmonic mean is " + String.format("%.2f", harmonicMean));
        System.out.println("Array items harmonic series is " + String.format("%.2f", harmonicSeries));
    }
}
