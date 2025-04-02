package Software.Intern;

public class SavingsAccount extends BankAccount {
    public SavingsAccount() {
        super();
        System.out.println("No-args constructor of SavingsAccount");

        super.deposit();
        System.out.println("Depositing into Savings Account");

        super.withdraw();
        System.out.println("Withdrawing from Savings Account");

        super.checkBalance();
        System.out.println("Checking balance of Savings Account");

        super.closeAccount();
        System.out.println("Closing Savings Account");
    }
}
