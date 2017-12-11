package com.revature;

public class Exit implements Command {
    public void run() {
        System.out.println("Thank you for using the Hello Financial World banking app.");
        BankApp.timeToExit = true;
    }
}