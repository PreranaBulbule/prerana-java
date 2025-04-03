package Software.Intern;

public class GoldRing extends Ring {
    public GoldRing() {
        super();
        System.out.println("No-args constructor of GoldRing");

        super.wearRing();
        System.out.println("Wearing a Gold Ring");

        super.removeRing();
        System.out.println("Removing a Gold Ring");

        super.cleanRing();
        System.out.println("Cleaning a Gold Ring");

        super.storeRing();
        System.out.println("Storing a Gold Ring safely");
    }
}
