package Software.Intern;

public class CottonBedSheet extends BedSheet {
    public CottonBedSheet() {
        super();
        System.out.println("No-args constructor of CottonBedSheet");

        super.spreadBedSheet();
        System.out.println("Spreading a cotton bedsheet smoothly");

        super.foldBedSheet();
        System.out.println("Folding a cotton bedsheet");

        super.washBedSheet();
        System.out.println("Washing a cotton bedsheet with mild detergent");

        super.storeBedSheet();
        System.out.println("Storing a cotton bedsheet properly");
    }
}