package Software.Intern;

public class ScentedCandle extends Candle {
    public ScentedCandle() {
        super();
        System.out.println("No-args constructor of ScentedCandle");

        super.light();
        System.out.println("Lighting the scented candle to release fragrance");

        super.melt();
        System.out.println("Scented candle wax melting and spreading aroma");

        super.extinguish();
        System.out.println("Blowing out the scented candle gently");

        super.store();
        System.out.println("Keeping the scented candle in a container to preserve its fragrance");
    }
}