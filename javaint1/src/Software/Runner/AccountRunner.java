package Software.Runner;
import Software.Intern.Account;
import Software.Intern.CreditAccount;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new Account();
        account.open();
        account.deposit();
        account.withdraw();
        account.close();
        System.out.println("======================");

        CreditAccount savingsAccount = new CreditAccount();
        savingsAccount.open();
        savingsAccount.deposit();
        savingsAccount.withdraw();
        savingsAccount.close();
    }
}
