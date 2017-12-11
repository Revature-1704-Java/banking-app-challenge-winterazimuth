package com.revature;

public class CheckingAccount extends Account {
    private int accountNumber;
    private long dollarBalance = 0;
    private short centBalance = 0;
    CheckingAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public long getDollarBalance() {
        return dollarBalance;
    }
    public short getCentBalance() {
        return centBalance;
    }
    public void incrementDollar(long amount) {
        dollarBalance += amount;
    }
    public void incrementCent(short amount) {
        short oldCentsValue = centBalance;
        short newCentsValue = amount;
        newCentsValue = oldCentsValue % 100;
        oldCentsValue -= newCentsValue;
        dollarsValue += (oldCentsValue)/100;
        centBalance += newCentsValue;
        dollarBalance += dollarsValue;
    }
    public void decrementDollar(long amount) {
        dollarBalance -= amount;
    }
    public void decrementCent(short amount) {
        short oldCentsValue = centBalance;
        short newCentsValue = amount;
        newCentsValue = oldCentsValue % 100;
        oldCentsValue += newCentsValue;
        dollarsValue -= (oldCentsValue)/100;
        centBalance -= newCentsValue;
        dollarBalance -= dollarsValue;
    }
}