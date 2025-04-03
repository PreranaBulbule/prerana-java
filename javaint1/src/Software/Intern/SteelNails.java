package Software.Intern;

public class SteelNails extends Nails {
    public SteelNails() {
        super();
        System.out.println("No-args constructor of SteelNails");

        super.manufacture();
        System.out.println("Manufacturing steel nails for durability");

        super.pack();
        System.out.println("Packing steel nails in rust-proof packaging");

        super.sell();
        System.out.println("Selling steel nails in bulk for industrial use");

        super.use();
        System.out.println("Using steel nails for strong and long-lasting constructions");
    }
}