package Software.Intern;

public class CashDispenser extends ATM {
    public CashDispenser() {
        super();
        System.out.println("No-args constructor of CashDispenser");

        super.insertCard();
        System.out.println("Card inserted in Cash Dispenser");

        super.enterPin();
        System.out.println("PIN entered in Cash Dispenser");

        super.selectTransaction();
        System.out.println("Transaction selected in Cash Dispenser");

        super.ejectCard();
        System.out.println("Card ejected from Cash Dispenser");
    }
}
