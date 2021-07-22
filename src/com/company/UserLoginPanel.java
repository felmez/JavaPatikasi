package com.company;

import java.util.*;

public class UserLoginPanel {
    public static void main(String[] args) {
        String userName = "patika", password = "lorem";
        int reset = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String iUserName = input.nextLine();

        System.out.print("Enter password: ");
        String iPassword = input.nextLine();

        if (iUserName.equals(userName) && iPassword.equals(password)) {
            System.out.println("Welcome " + userName);
        }
        if (!iUserName.equals(userName) || !iPassword.equals(password)) {
            System.out.println("Wrong username or password!");
            System.out.print("Forgot password? \n1- Yes, Reset Password \n2- No, Try Again \n");
            reset = input.nextInt();

            if (reset != 1) {
                System.out.println("Okay...");
            } else {
                System.out.print("Enter new password: ");
                String newPassword = input.next();

                if (newPassword.equals(iPassword) || newPassword.equals(password)) {
                    System.out.println("Can't use this password, please try another password.");
                } else {
                    System.out.println("Password reset successfully.");
                }
            }
        }
    }
}
