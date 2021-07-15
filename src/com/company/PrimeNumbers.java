package com.company;


public class PrimeNumbers {
    public static void main(String[] args) {
        int number, preNumber;
        String primeNumbers = "";

        for (number = 1; number <= 100; number++) {
            int counter = 0;
            for (preNumber = number; preNumber >= 1; preNumber--) {
                if (number % preNumber == 0) {
                    counter += 1;
                }
            }
            if (counter == 2) {
                primeNumbers += number + " ";
            }
        }
        System.out.println(primeNumbers);
    }
}
