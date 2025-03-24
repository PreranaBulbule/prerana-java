package com.xworkz.AccessSpecifier;

public class Main {
    public static void main(String[] args) {

        Book book = new Book();
        book.title = "The Alchemist";
        book.author = "Paulo Coelho";
        book.displayBook();
        System.out.println("---------------------------");

        BankAccount acc = new BankAccount();
        acc.accountType = "Savings";
        acc.showAccountType();

        System.out.println("------------------------");
        ATM atm = new ATM();
        atm.setPin(1234);

        System.out.println("---------------------------");

        Employee emp = new Employee();
        emp.showName();
        emp.showEmpId();
        emp.accessPrivateSalary();

        System.out.println("---------------------------");
        UserAccount user = new UserAccount();
        user.setPassword("SecurePass123");
        System.out.println("User Password: " + user.getPassword());
    }
}
