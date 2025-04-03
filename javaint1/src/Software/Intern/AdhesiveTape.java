package Software.Intern;

public class AdhesiveTape extends Tape {
    public AdhesiveTape() {
        super();
        System.out.println("No-args constructor of AdhesiveTape");

        super.stick();
        System.out.println("Applying adhesive tape for secure bonding");

        super.cut();
        System.out.println("Using scissors to cut adhesive tape neatly");

        super.remove();
        System.out.println("Peeling off adhesive tape without leaving residue");

        super.store();
        System.out.println("Keeping adhesive tape in a cool and dry place");
    }
}