package com.systechafrica.atmmachine;

import java.util.Scanner;

public class ATMMachine {
    final double INITIAL_BALANCE = 1000.00;
    final double WITHDRAWAL_CHARGES = 0.02;
    final String DEFAULT_PASSWORD = "Admin123";
    final int LOGIN_ATTEMPTS = 3;
    double runningBalance = INITIAL_BALANCE;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ATMMachine app = new ATMMachine();
        boolean loggedIn = app.login();
        if (loggedIn) {
            System.out.println("logged in successfully");
            // display menu
            boolean keepShowingMenu = true;
            while (keepShowingMenu) { // while(true)
                app.displayMenu();
                try {
                    System.out.print("Choose your option: ");
                    int option = app.scanner.nextInt(); // \n
                    /*
                     * if (option == 1) {
                     * app.checkBalance();
                     * } else if (option == 2) {
                     * app.performDeposit();
                     * } else if (option == 3) {
                     * app.performWithdrawal();
                     * } else if (option == 4) {
                     * app.performTransfer();
                     * } else if (option == 5) {
                     * keepShowingMenu=false;
                     * } else {
                     * System.out.println("Invalid option...try again");
                     * }
                     */

                    switch (option) {
                        case 1:
                            app.checkBalance();
                            break;
                        case 2:
                            app.performDeposit();
                            break;
                        case 3:
                            app.performWithdrawal();
                            break;
                        case 4:
                            app.performTransfer();
                            break;
                        case 5:
                            keepShowingMenu = false;
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }

                } catch (Exception e) {
                    app.scanner.nextLine(); //! this is to clear the \n character that is retained when using scanner with nextInt()
                    System.out.println("Invalid input: We only require integer values");
                }
            }

        } else {
            System.out.println("Maximum attempt failed");
        }

    }

    public boolean login() {
        // ? try three times , exit if not logged in
        int loginEntries = 1;
        boolean loggedIn = false;

        while (loginEntries <= 3) {
            System.out.print("Enter your password: ");
            String userPassword = scanner.nextLine();
            if (userPassword.equals(DEFAULT_PASSWORD)) {
                // show menu
                loggedIn = true;
                break;
            }
            System.out.println("Wrong password");
            loginEntries++; // loginEntries = loginEntries+1;
        }
        return loggedIn;
        /*
         * // while the value remain "proceed"
         * String retry = "Yes";
         * 
         * for (int i = 1; i <= LOGIN_ATTEMPTS; i++) {
         * System.out.print("Enter your password: ");
         * String userPassword = scanner.nextLine();
         * if (userPassword.equals(DEFAULT_PASSWORD)) {
         * // show menu
         * loggedIn = true;
         * break;
         * }
         * System.out.println("Wrong password");
         * }
         */

    }

    public void displayMenu() {
        System.out.println("******************************");
        System.out.println("********ATM SIMULATOR*********");
        System.out.println("******************************");
        System.out.println("********ATM SERVICES**********");
        System.out.println("______________________________");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer Cash");
        System.out.println("5. Quit");

    }

    public void checkBalance() {
        System.out.println("Your balance is: " + runningBalance);
    }

    public void performDeposit() {
        // ? get the amount to deposit
        double amountToDeposit = scanner.nextDouble();
        // ? add the amount to the balance
        runningBalance += amountToDeposit;// runningBalance = runningBalance+amountToDeposit
    }

    public void performWithdrawal() {
        // ? get the amount to withdraw
        // ? calculate the amount to withdraw + charges
        // ? check if running balance is sufficient
    }

    public void performTransfer() {
        // ? get the amount to withdraw
        // ? subtract the amount from the balance
    }

    public void printReceipt() {
        // you can print information about the transaction
    }

}
