package com.company;
import java.util.*;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        int kilo;
        double boy;
        double index;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();
        index = kilo / Math.pow(boy, 2);
        System.out.println("Vücut Kitle İndeksiniz : " + String.format("%.2f", index));

    }
}
