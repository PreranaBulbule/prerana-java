package Software.Intern;

public class LeatherWallet extends Wallet {
    public LeatherWallet() {
        super();
        System.out.println("No-args constructor of LeatherWallet");

        super.open();
        System.out.println("Opening the leather wallet to access its compartments");

        super.close();
        System.out.println("Closing the leather wallet with a secure button");

        super.storeMoney();
        System.out.println("Organizing money and cards in the leather wallet");

        super.keepSafe();
        System.out.println("Keeping the leather wallet in a pocket or bag safely");
    }
}