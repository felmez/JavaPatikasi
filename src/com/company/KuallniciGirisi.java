package com.company;

import java.util.*;

public class KuallniciGirisi {
    public static void main(String[] args) {
        String userName = "patika", password = "lorem";
        int reset = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adinizi Giriniz: ");
        String iUserName = input.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        String iPassword = input.nextLine();
        if (iUserName.equals(userName) && iPassword.equals(password)) {
            System.out.println("Hos Geldin " + userName);
        }
        if (!iUserName.equals(userName) || !iPassword.equals(password)) {
            System.out.println("Kullanici Adi veya Sifre Hatali!");
            System.out.print("Sifrenizi mi Unuttunuz? \n1- Evet Sifirlamak Istiyorum \n2- Hayir Tekrar Denemek Istiyorum \n");
            reset = input.nextInt();
            if (reset != 1) {
                System.out.println("Peki...");
            }
            else {
                System.out.print("Yeni Sifrenizi Giriniz: ");
                String newPassword = input.next();
                if (newPassword.equals(iPassword) || newPassword.equals(password)) {
                    System.out.println("Sifre Olusturulamadi, Lutfen Baska Sifre Giriniz.");
                } else {
                    System.out.println("Sifre Olusturuldu.");
                }
            }
        }
    }
}
