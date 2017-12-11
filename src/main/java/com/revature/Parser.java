package com.revature;

import java.io.*;
import java.util.Scanner;

public class Parser {
    public void parse() {
        Scanner sc = new Scanner(System.in);
        String line = "";
        boolean recognized = false;

        while (true) {
            line = sc.nextLine();
            line = line.toLowerCase();
            if (DataList.loggedIn == false) {
                System.out.println("Enter \"login\" to log into an existing account");
                System.out.println("Enter \"create\" to create an account");
                System.out.println("Enter \"exit\" to exit");

                if (line.equals("login")) {
                    LogIn loggerin = new LogIn();
                    loggerin.run();
                    recognized = true;
                    if (DataList.loggedIn == true)
                        break;
                }

                if (line.equals("create")) {
                    CreateNewAccount creator = new CreateNewAccount();
                    creator.run();
                    recognized = true;
                }
                
                if (line.equals("exit")) {
                    Exit exiter = new Exit();
                    exiter.run();
                    recognized = true;
                    break;
                }
                
                if (recognized == false)
                    System.out.println("Not a recognized command");
                recognized = false;
            }
        else {
                System.out.println("Enter \"logout\" to log out");
                System.out.println("Enter \"exit\" to exit");

                if (line.equals("logout")) {
                    LogOut loggerout = new LogOut();
                    loggerout.run();
                    recognized = true;
                    break;
                }

                if (line.equals("exit")) {
                    Exit exiter = new Exit();
                    exiter.run();
                    recognized = true;
                    break;
                }

                if (recognized == false)
                    System.out.println("Not a recognized command");
                recognized = false;
            }
        }

        sc.close();
    }
}