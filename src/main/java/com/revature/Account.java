package com.revature;

public abstract class Account {
    public abstract long getDollarBalance();
    public abstract short getCentBalance();
    public abstract void incrementDollar(long amount);
    public abstract void incrementCent(short amount);
    public abstract void decrementDollar(long amount);
    public abstract void decrementCent(short amount);
}