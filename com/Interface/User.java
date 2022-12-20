package com.Interface;

import java.util.Scanner;

public class User {

    public static String username;
    public static String password;
    private  static String[][] accounts = {{"shubham", "shubham@123"},{"omkar", "omkar@123"}};

    public static void users(String name, String pass)
    {
        username =name;
        password = pass;
    }

    public static boolean auth(){
        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])) ||
                (username.equals(accounts[1][0])) && (password.equals(accounts[1][1])))
            return true;
        else
            return false;
    }



}
