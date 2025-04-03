package Software.Intern;

public class PlasticStraw extends Straw {
    public PlasticStraw() {
        super();
        System.out.println("No-args constructor of PlasticStraw");

        super.sip();
        System.out.println("Using a plastic straw for cold beverages");

        super.bend();
        System.out.println("Bending the flexible plastic straw easily");

        super.dispose();
        System.out.println("Discarding the plastic straw in a recycling bin");

        super.store();
        System.out.println("Keeping plastic straws in a sealed packet");
    }
}