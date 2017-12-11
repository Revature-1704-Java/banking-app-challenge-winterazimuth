package com.revature;

import java.io.*;
import java.util.Scanner;

public class Deposit implements Command {
    public void run() {
        Scanner sc = new Scanner(System.in);
        long dollars;
        short cents;
        int account;
        System.out.println("How many dollars would you like to deposit?");
        dollars = sc.nextLong();
        System.out.println("How many cents would you like to deposit?");
        cents = sc.nextShort();
        System.out.println("In which account would you like to make the deposit? Enter 0 for savings or 1 for checking.");
        account = sc.nextInt();
        if (account == 0) {
            SavingsAccount savingsDepositCopy = DataList.getSavingsAccount(DataList.getSession());
            savingsDepositCopy.incrementDollar(dollars);
            savingsDepositCopy.incrementCent(cents);
            DataList.setSavingsAccount(DataList.getSession(), savingsDepositCopy);
        }
        if (account == 1) {
            CheckingAccount checkingDepositCopy = DataList.getCheckingAccount(DataList.getSession());
            checkingDepositCopy.incrementDollar(dollars);
            checkingDepositCopy.incrementCent(cents);
            DataList.setCheckingAccount(DataList.getSession(), checkingDepositCopy);
        }
    }
}