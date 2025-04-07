package com.xworkz.Runner;

import com.xworkz.override.Account;
import com.xworkz.override.Bank;
import com.xworkz.override.SavingsAccount;

public class AccountRunner {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit();
        acc1.withdraw();
        acc1.checkBalance();
        acc1.accountType();
        acc1.interestRate();

        System.out.println("-------------------");
        Account acc2 = new SavingsAccount();
        acc2.deposit();
        acc2.withdraw();
        acc2.checkBalance();
        acc2.accountType();
        acc2.interestRate();

        System.out.println("-----------------");
        SavingsAccount savings = new SavingsAccount();
        savings.deposit();
        savings.withdraw();
        savings.checkBalance();
        savings.accountType();
        savings.interestRate();
        savings.enableOnlineBanking();

        System.out.println("------------------");
        Bank bank = new Bank();
        bank.manage(acc2);
        bank.manage(acc1);
        bank.manage(savings);
    }
}

