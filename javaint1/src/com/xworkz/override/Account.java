package com.xworkz.override;

public class Account {
    public Account() {
        System.out.println("Running non-arg constructor Account--parent");
    }

    public void deposit() {
        System.out.println("Deposit money into account--parent");
    }

    public void withdraw() {
        System.out.println("Withdraw money from account--parent");
    }

    public void checkBalance() {
        System.out.println("Check account balance--parent");
    }

    public void accountType() {
        System.out.println("Generic account type--parent");
    }

    public void interestRate() {
        System.out.println("Generic interest rate--parent");
    }
}

