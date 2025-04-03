package Software.Intern;

public class FastCharger extends Charger {
    public FastCharger() {
        super();
        System.out.println("No-args constructor of FastCharger");

        super.plugIn();
        System.out.println("Plugging in a fast charger");

        super.chargeDevice();
        System.out.println("Charging the device quickly with a fast charger");

        super.unplugCharger();
        System.out.println("Unplugging the fast charger after a quick charge");

        super.storeCharger();
        System.out.println("Keeping the fast charger in a safe place");
    }
}
