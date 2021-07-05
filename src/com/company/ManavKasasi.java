package com.company;
import java.util.*;

public class ManavKasasi {
    public static void main(String[] args) {
        double armutF = 2.14, elmaF = 3.67, domatesF = 1.11, muzF = 0.95, patlicanF = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? ");
        int armutK = input.nextInt();
        System.out.print("Elam Kaç Kilo? ");
        int elmaK = input.nextInt();
        System.out.print("Domates Kaç Kilo? ");
        int domatesK = input.nextInt();
        System.out.print("Muz Kaç Kilo? ");
        int muzK = input.nextInt();
        System.out.print("Patlıcan Kaç Kilo? ");
        int patlicanK = input.nextInt();
        System.out.println("Toplam Tutar: " + (armutF * armutK + elmaF * elmaK + domatesF * domatesK + muzF * muzK + patlicanF * patlicanK));

    }
}
