package com.revature;

public class BankApp {
    public static boolean timeToExit = false;

    public static void main(String[] args) {
        System.out.println("Hello, financial world!");
        DataList data = new DataList();
        Parser parser1 = new Parser();
        while (timeToExit == false) {
                parser1.parse();
        }
    }
}