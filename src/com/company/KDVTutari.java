package com.company;
import java.util.*;

public class KDVTutari {
    public static void main(String[] args) {
        double tutar;
        double kdv;
        double kdvliTutar;
        double onsekizOrani = 0.18;
        double sekizOrani = 0.08;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Giriniz : ");
        tutar = input.nextDouble();
        if (tutar >= 0 && tutar <= 1000) {
            kdv = tutar * onsekizOrani;
            kdvliTutar = tutar + kdv;
            System.out.println("KDV Orani : %18");
            System.out.println("KDV Tutari : " + kdv);
            System.out.println("KDVli Tutar : " + kdvliTutar);
        }
        if (tutar > 1000) {
            kdv = tutar * sekizOrani;
            kdvliTutar = tutar + kdv;
            System.out.println("KDV Orani = %8");
            System.out.println("KDV Tutari : " + kdv);
            System.out.println("KDVli Tutar : " + kdvliTutar);
        }
    }
}
