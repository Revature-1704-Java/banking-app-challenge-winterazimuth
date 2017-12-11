package com.revature;

public class LogOut implements Command {
    public void run() {
        DataList.sessionEnd();
    }
}