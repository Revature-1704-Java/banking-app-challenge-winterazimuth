package com.revature;

import java.io.*;
import java.util.Scanner;

public class ChangeAccountDetails implements Command {
    public void run() {
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int userNumber;
        System.out.println("Please enter your account number:");
        userNumber = sc.nextInt();
        if (DataList.accountNumberIsDuplicate(userNumber)) {
            System.out.println("Please enter your current first name:");
            firstName = sc.nextLine();
            System.out.println("Please enter your current last name:");
            lastName = sc.nextLine();
            Customer toChange = DataList.getCustomer(userNumber);
            toChange.setFirstName(firstName);
            toChange.setLastName(lastName);
            DataList.setCustomer(userNumber,toChange);
            System.out.println("Welcome back, " + firstName + " " + lastName + "!");
        } else System.out.println("Number not recognized.");
    }
}