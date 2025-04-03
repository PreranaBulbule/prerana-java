package Software.Intern;

public class WirelessMouse extends Mouse {
    public WirelessMouse() {
        super();
        System.out.println("No-args constructor of WirelessMouse");

        super.click();
        System.out.println("Clicking the wireless mouse with a smooth response");

        super.scroll();
        System.out.println("Scrolling wirelessly with precision");

        super.move();
        System.out.println("Moving the wireless mouse freely without cables");

        super.connect();
        System.out.println("Connecting the wireless mouse via Bluetooth");
    }
}