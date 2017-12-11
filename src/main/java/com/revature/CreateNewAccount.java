package com.revature;

import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.Scanner;

public class CreateNewAccount implements Command {
    public void run() {
        int randomNum;
        do {
            randomNum = ThreadLocalRandom.current().nextInt(1000000000, 2147483647);
        } while (DataList.accountNumberIsDuplicate(randomNum) == true);
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        System.out.println("Please enter your first name:");
        firstName = sc.nextLine();
        System.out.println("Please enter your last name:");
        lastName = sc.nextLine();
        System.out.println("Welcome, " + firstName + " " + lastName + "! Your account number is " + randomNum);
        DataList.addPerson(firstName, lastName, randomNum);
    }
}