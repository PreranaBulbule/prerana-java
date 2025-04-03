package Software.Intern;

public class SoftPillow extends Pillow {
    public SoftPillow() {
        super();
        System.out.println("No-args constructor of SoftPillow");

        super.usePillow();
        System.out.println("Using a soft pillow for better comfort");

        super.fluffPillow();
        System.out.println("Fluffing a soft pillow gently");

        super.cleanPillow();
        System.out.println("Washing the soft pillow cover");

        super.storePillow();
        System.out.println("Storing the soft pillow in a dry place");
    }
}
