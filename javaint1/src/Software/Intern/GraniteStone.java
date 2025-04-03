package Software.Intern;

public class GraniteStone extends Stone {
    public GraniteStone() {
        super();
        System.out.println("No-args constructor of GraniteStone");

        super.throwStone();
        System.out.println("Throwing the granite stone carefully due to its weight");

        super.polish();
        System.out.println("Polishing the granite stone for a smooth finish");

        super.useForBuilding();
        System.out.println("Using granite stone in flooring and countertops");

        super.store();
        System.out.println("Storing granite stone slabs in a secure place");
    }
}