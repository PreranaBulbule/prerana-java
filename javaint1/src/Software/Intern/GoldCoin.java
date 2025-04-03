package Software.Intern;

public class GoldCoin extends Coin {
    public GoldCoin() {
        super();
        System.out.println("No-args constructor of GoldCoin");

        super.flip();
        System.out.println("Flipping the gold coin carefully to avoid damage");

        super.collect();
        System.out.println("Collecting gold coins as a valuable investment");

        super.spend();
        System.out.println("Using the gold coin for trading or as a gift");

        super.store();
        System.out.println("Keeping the gold coin in a secure vault");
    }
}
