package com.revature;

import java.util.*;

public class DataList {
    private static ArrayList<Customer> customers = new ArrayList<Customer>();
    private static ArrayList<CheckingAccount> checkingaccounts = new ArrayList<CheckingAccount>();
    private static ArrayList<SavingsAccount> savingsaccounts = new ArrayList<SavingsAccount>();
    private static ArrayList<Integer> accountnumbers = new ArrayList<Integer>();

    private static HashMap<Integer,Customer> customersMap = new HashMap<Integer,Customer>();
    private static HashMap<Integer,CheckingAccount> checkingAccountsMap = new HashMap<Integer,CheckingAccount>();
    private static HashMap<Integer,SavingsAccount> savingsAccountsMap = new HashMap<Integer,SavingsAccount>();

    private static int session = 0;
    public static boolean loggedIn = false;

    public static void addPerson(String firstName, String lastName, int accountNumber) {
        accountnumbers.add(accountNumber);
        Customer customer = new Customer(firstName, lastName, accountNumber);
        customers.add(customer);
        CheckingAccount checkingaccount = new CheckingAccount(accountNumber);
        checkingaccounts.add(checkingaccount);
        SavingsAccount savingsaccount = new SavingsAccount(accountNumber);
        savingsaccounts.add(savingsaccount);

        customersMap.put(accountNumber, customer);
        checkingAccountsMap.put(accountNumber, checkingaccount);
        savingsAccountsMap.put(accountNumber, savingsaccount);
    }

    public static Customer getCustomer(int id) {
        return customersMap.get(id);
    }

    public static void setCustomer(int id, Customer changed) {
        customersMpa.replace(id, changed);
    }

    public static CheckingAccount getCheckingAccount(int id) {
        return checkingAccountsMap.get(id);
    }

    public static void setCheckingAccount(int id, CheckingAccount changed) {
        checkingAccountsMap.replace(id, changed);
    }

    public static SavingsAccount getSavingsAccount(int id) {
        return savingsAccountsMap.get(id);
    }

    public static void setSavingsAccount(int id, SavingsAccount changed) {
        savingsAccountsMap.replace(id, changed);
    }

    public static boolean accountNumberIsDuplicate(int number) {
        if (accountnumbers.contains(number))
            return true;
        else
            return false;
    }

    public static void sessionStart(int id) {
        session = id;
        loggedIn = true;
    }

    public static void sessionEnd() {
        session = 0;
        loggedIn = false;
    }

    public static String getName(int id) {
        Customer nameHaver = customersMap.get(id);
        return (nameHaver.getFirstName() + " " + nameHaver.getLastName());
    }

    public static int getSession() {
        return session;
    }
}