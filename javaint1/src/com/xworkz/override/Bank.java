package com.xworkz.override;

public class Bank {
    public void manage(Account account) {
        account.deposit();
        account.withdraw();
        account.checkBalance();
        account.accountType();
        account.interestRate();

        if(account instanceof SavingsAccount) {
            System.out.println("account is instance of SavingsAccount");
            SavingsAccount savings = (SavingsAccount) account;
            savings.enableOnlineBanking();
        }
    }
}

