package Software.Intern;

public class PaperNapkin extends Napkin {
    public PaperNapkin() {
        super();
        System.out.println("No-args constructor of PaperNapkin");

        super.use();
        System.out.println("Using the paper napkin for quick cleanup");

        super.fold();
        System.out.println("Folding the paper napkin before disposal");

        super.dispose();
        System.out.println("Throwing the used paper napkin in a trash bin");

        super.store();
        System.out.println("Keeping paper napkins in a dry and accessible place");
    }
}