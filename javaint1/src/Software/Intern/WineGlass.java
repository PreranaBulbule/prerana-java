package Software.Intern;

public class WineGlass extends Glass {
    public WineGlass() {
        super();
        System.out.println("No-args constructor of WineGlass");

        super.useGlass();
        System.out.println("Using a Wine Glass");

        super.washGlass();
        System.out.println("Washing a Wine Glass");

        super.storeGlass();
        System.out.println("Storing a Wine Glass");

        super.breakGlass();
        System.out.println("Breaking a Wine Glass");
    }
}
