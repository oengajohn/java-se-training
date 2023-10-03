package com.systechafrica.part4.localization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ATMMachine {
    final double INITIAL_BALANCE = 1000.00;

    final double WITHDRAWAL_CHARGES = 0.02;

    final String DEFAULT_PASSWORD = "Admin123";

    final int LOGIN_ATTEMPTS = 3;

    double runningBalance = INITIAL_BALANCE;

    Scanner scanner = new Scanner(System.in);

    public static String getProperty(Locale locale, String key) {
        ResourceBundle rb = ResourceBundle.getBundle("ATM", locale);
        return rb.getString(key);
    }
    static Locale locale = Locale.GERMAN;
    public static void main(String[] args) {
        ATMMachine app = new ATMMachine();
        boolean loggedIn = app.login();

        if (loggedIn) {
            System.out.println(getProperty(locale,"login-success"));


        } else {
            System.out.println(getProperty(locale,"attempt-failure"));
        }

    }

    public boolean login() {
        // ? try three times , exit if not logged in
        int loginEntries = 1;
        boolean loggedIn = false;

        while (loginEntries <= 3) {
            System.out.print(getProperty(locale,"password-prompt"));
            String userPassword = scanner.nextLine();
            if (userPassword.equals(DEFAULT_PASSWORD)) {
                // show menu
                loggedIn = true;
                break;
            }
            System.out.println("Wrong password");
            loginEntries++;
        }
        return loggedIn;


    }
}
