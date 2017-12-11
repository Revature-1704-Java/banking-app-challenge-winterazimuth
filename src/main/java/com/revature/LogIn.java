package com.revature;

import java.io.*;
import java.util.Scanner;

public class LogIn implements Command {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int userNumber;
        System.out.println("Please enter your account number:");
        userNumber = sc.nextInt();
        if (DataList.accountNumberIsDuplicate(userNumber)) {
            System.out.println("Welcome back, " + DataList.getName(userNumber) + ".");
            DataList.sessionStart(userNumber);
        } else System.out.println("Number not recognized.");
    }
}