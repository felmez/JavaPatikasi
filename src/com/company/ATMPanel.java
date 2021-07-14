package com.company;

import java.util.Scanner;

public class ATMPanel {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int passwordAttempts = 3;
        int balance = 1500;
        int selection;
        while (passwordAttempts > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("devops")) {
                System.out.println("--Welcome To Your Awesome Bank.");
                do {
                    System.out.println("1- Deposit\n" +
                            "2- Withdrawal\n" +
                            "3- Balance Check\n" +
                            "4- Exit");
                    System.out.print("--Please Select Your Option: ");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("--Money Amount: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.print("--Money Amount: ");
                            int withdrawal = input.nextInt();
                            if (withdrawal > balance) {
                                System.out.println("--Insufficient Balance.");
                            } else {
                                balance -= withdrawal;
                            }
                            break;
                        case 3:
                            System.out.println("--Your Balance: " + balance);
                            break;
                    }
                } while (selection != 4);
                System.out.println("GoodBye.");
                break;
            } else {
                passwordAttempts--;
                System.out.println("--Wrong Username or Password.");
                if (passwordAttempts == 0) {
                    System.out.println("--Your Account Has Been Blocked, Please Contact Your Bank.");
                } else {
                    System.out.println("--Remaining Attempts: " + passwordAttempts);
                }
            }
        }
    }
}
