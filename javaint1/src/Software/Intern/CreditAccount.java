package Software.Intern;

public class CreditAccount extends Account {
    public CreditAccount() {
        System.out.println("No-args constructor of SavingsAccount");
    }
        @Override
        public void open()
    {
        System.out.println("Opening a savings account with interest benefits");
    }
    @Override
    public void deposit() {
        System.out.println("Depositing money into the savings account with interest accumulation");
    }
    @Override
    public void withdraw() {
        System.out.println("Withdrawing money from the savings account with some limits");
    }
    @Override
    public void close(){
        System.out.println("Closing the savings account after clearing all dues");
    }
}