package com.systechafrica.userinput;

import java.util.Scanner;
import java.util.logging.Logger;

import com.systechafrica.util.ValidateInput;

public class UserInputUsingScanner {
    private static final Logger LOGGER = Logger.getLogger(UserInputUsingScanner.class.getName());

    public static void main(String[] args) {
        final String DB_USERNAME = "mhusika";
        final String DB_PASSWORD = "Admin123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (ValidateInput.validate(username) && ValidateInput.validate(password)) {

            if (username.equals(DB_USERNAME) && password.equals(DB_PASSWORD)) {
                System.out.println("***************");
                System.out.println("ATM SIMULATOR");
                System.out.println("***************");
                System.out.println("ATM SERVICES");
                System.out.println("___________________________");
            } else {
                System.err.println("Incorrect username or password");
            }
        }
        else{
            throw new IllegalStateException("Invalid username or password");
        }
        scanner.close();

    }

}
