package Software.Intern;

public class OrangeJuice extends Juice {
    public OrangeJuice() {
        super();
        System.out.println("No-args constructor of OrangeJuice");

        super.extract();
        System.out.println("Extracting fresh juice from ripe oranges");

        super.filter();
        System.out.println("Filtering orange juice to remove seeds and excess pulp");

        super.pack();
        System.out.println("Packing orange juice in tetra packs for freshness");

        super.drink();
        System.out.println("Enjoying the tangy and refreshing orange juice");
    }
}