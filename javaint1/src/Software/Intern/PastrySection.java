package Software.Intern;

public class PastrySection extends Bakery {
    public PastrySection() {
        super();
        System.out.println("No-args constructor of PastrySection");

        super.bakeBread();
        System.out.println("Pastry section preparing specialty bread");

        super.prepareCakes();
        System.out.println("Pastry section making customized cakes");

        super.serveCustomers();
        System.out.println("Pastry section serving fresh pastries");

        super.cleanBakery();
        System.out.println("Pastry section cleaning workstations");
    }
}
