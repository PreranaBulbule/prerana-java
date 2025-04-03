package Software.Intern;

public class HerbalSoap extends Soap {
    public HerbalSoap() {
        super();
        System.out.println("No-args constructor of HerbalSoap");

        super.useSoap();
        System.out.println("Using an herbal soap for a refreshing bath");

        super.latherSoap();
        System.out.println("Creating a rich lather with herbal soap");

        super.rinseSoap();
        System.out.println("Rinsing off the herbal soap with warm water");

        super.storeSoap();
        System.out.println("Keeping the herbal soap in a soap dish");
    }
}
