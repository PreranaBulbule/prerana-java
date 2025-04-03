package Software.Intern;

public class BikeHelmet extends Helmet {
    public BikeHelmet() {
        super();
        System.out.println("No-args constructor of BikeHelmet");

        super.wear();
        System.out.println("Wearing the bike helmet for head protection while riding");

        super.adjust();
        System.out.println("Ensuring the bike helmet fits snugly");

        super.remove();
        System.out.println("Taking off the bike helmet after use");

        super.store();
        System.out.println("Keeping the bike helmet in a dry and safe location");
    }
}