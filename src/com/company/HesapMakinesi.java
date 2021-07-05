package com.company;
import java.util.*;

public class HesapMakinesi {
    public static void main(String[] args) {
        double first, second, result = 0;
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.print("Ilk Sayiyi Giriniz: ");
        first = input.nextDouble();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        second = input.nextDouble();
        System.out.println("Lutfen Islemi Seciniz: \n1-+\n2--\n3-*\n4-/");
        selection = input.nextInt();
        switch (selection) {
            case 1:
                result = first + second;
                System.out.println(result);
                break;
            case 2:
                result = first - second;
                System.out.println(result);
                break;
            case 3:
                result = first * second;
                System.out.println(result);
                break;
            case 4:
                if (second != 0) {
                    result = first / second;
                    System.out.println(result);
                }
                else {
                    System.out.println("Sifira Bolenemz");
                }
                break;
            default:
                System.out.println("Hatali Secim veya Giris");
                break;
        }
    }
}
