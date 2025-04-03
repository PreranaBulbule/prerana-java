package Software.Intern;

public class CreditAccount extends Account {
    public CreditAccount() {
        super();
        System.out.println("No-args constructor of SavingsAccount");

        super.open();
        System.out.println("Opening a savings account with interest benefits");

        super.deposit();
        System.out.println("Depositing money into the savings account with interest accumulation");

        super.withdraw();
        System.out.println("Withdrawing money from the savings account with some limits");

        super.close();
        System.out.println("Closing the savings account after clearing all dues");
    }
}