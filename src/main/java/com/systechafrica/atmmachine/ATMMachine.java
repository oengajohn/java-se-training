package com.systechafrica.atmmachine;

import java.util.Scanner;

public class ATMMachine {
    final double INITIAL_BALANCE = 1000.00;
    final double WITHDRAWAL_CHARGES = 0.02;
    final String DEFAULT_PASSWORD = "Admin123";
    double runningBalance = INITIAL_BALANCE;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ATMMachine app =  new ATMMachine();
        boolean loggedIn = app.login();
        if(loggedIn) {
            System.out.println("logged in successfully");
            // show menu
        }else {
            System.out.println("Maximum attempt failed");
        }

    }

    public boolean login() {
        // ? try three times , exit if not logged in
        int loginEntries = 1;
        boolean loggedIn = false;
        while(loginEntries<=3){
            System.out.print("Enter your password: ");
            String userPassword = scanner.nextLine();
            if(userPassword.equals(DEFAULT_PASSWORD)){
                // show menu
                loggedIn = true;
                break;
            }
            System.out.println("Wrong password");
            loginEntries++; // loginEntries = loginEntries+1;
        }
        return loggedIn;
    }

    public void displayMenu() {

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
