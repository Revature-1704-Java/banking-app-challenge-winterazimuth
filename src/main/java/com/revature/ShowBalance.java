package com.revature;

import java.io.*;
import java.util.Scanner;

public class ShowBalance implements Command {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For which account would you like to see your balance? Enter 0 for savings or 1 for checking.");
        account = sc.nextInt();
        if (account == 0) {
            SavingsAccount showBalanceCopy = DataList.getSavingsAccount(DataList.getSession());
            System.out.println("$" + showBalanceCopy.getDollarBalance() + "." + showBalanceCopy.getCentBalance());
        }
        if (account == 1) {
            CheckingAccount showBalanceCopy = DataList.getCheckingAccount(DataList.getSession());
            System.out.println("$" + showBalanceCopy.getDollarBalance() + "." + showBalanceCopy.getCentBalance());
        }
    }
}