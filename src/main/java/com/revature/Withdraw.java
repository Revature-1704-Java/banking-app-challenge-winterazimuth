package com.revature;

import java.io.*;
import java.util.Scanner;

public class Withdrawal implements Command {
    public void run() {
        Scanner sc = new Scanner(System.in);
        long dollars;
        short cents;
        int account;
        System.out.println("How many dollars would you like to withdraw?");
        dollars = sc.nextLong();
        System.out.println("How many cents would you like to withdraw?");
        cents = sc.nextShort();
        System.out.println("In which account would you like to make the withdrawal? Enter 0 for savings or 1 for checking.");
        account = sc.nextInt();
        if (account == 0) {
            SavingsAccount savingsWithdrawalCopy = DataList.getSavingsAccount(DataList.getSession());
            savingsWithdrawalCopy.decrementDollar(dollars);
            savingsWithdrawalCopy.decrementCent(cents);
            DataList.setSavingsAccount(DataList.getSession(), savingsDepositCopy);
        }
        if (account == 1) {
            CheckingAccount checkingWithdrawalCopy = DataList.getCheckingAccount(DataList.getSession());
            checkingWithdrawalCopy.decrementDollar(dollars);
            checkingWithdrawalCopy.decrementCent(cents);
            DataList.setCheckingAccount(DataList.getSession(), checkingDepositCopy);
        }
    }
}