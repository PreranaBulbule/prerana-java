package Software.Intern;

public class GamingLaptop extends Laptop {
    public GamingLaptop() {
        super();
        System.out.println("No-args constructor of GamingLaptop");

        super.powerOn();
        System.out.println("Powering on the Gaming Laptop");

        super.openSoftware();
        System.out.println("Opening a high-performance game");

        super.browseInternet();
        System.out.println("Browsing gaming forums");

        super.shutDown();
        System.out.println("Shutting down the Gaming Laptop");
    }
}