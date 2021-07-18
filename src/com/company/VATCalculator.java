package com.company;

import java.util.*;

public class VATCalculator {
    public static void main(String[] args) {
        double amount;
        double vat;
        double taxedAmount;
        double highLevelTaxRate = 0.18;
        double lowLevelTaxRate = 0.08;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your amount: ");
        amount = input.nextDouble();

        if (amount >= 0 && amount <= 1000) {
            vat = amount * highLevelTaxRate;
            taxedAmount = amount + vat;
            System.out.println("VAT Rate: %18");
            System.out.println("Tax Amount: " + vat);
            System.out.println("Taxed Amount: " + taxedAmount);
        }
        if (amount > 1000) {
            vat = amount * lowLevelTaxRate;
            taxedAmount = amount + vat;
            System.out.println("VAT Rate: %8");
            System.out.println("Tax Amount: " + vat);
            System.out.println("Taxed Amount: " + taxedAmount);
        }
    }
}
