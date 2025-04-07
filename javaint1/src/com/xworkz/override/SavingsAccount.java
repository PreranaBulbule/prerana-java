package com.xworkz.override;

public class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
        System.out.println("Running non-arg constructor SavingsAccount");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit money into savings account--child");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw money from savings account--child");
    }

    @Override
    public void checkBalance() {
        System.out.println("Check savings account balance--child");
    }

    @Override
    public void accountType() {
        System.out.println("Savings account type--child");
    }

    @Override
    public void interestRate() {
        System.out.println("Savings account interest rate is 4%--child");
    }

    public void enableOnlineBanking() {
        System.out.println("Online banking enabled for savings account--child only method");
    }
}
