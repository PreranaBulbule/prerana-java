package Software.Intern;

public class RecyclingBin extends Dustbin {
    public RecyclingBin() {
        super();
        System.out.println("No-args constructor of RecyclingBin");

        super.openLid();
        System.out.println("Opening the recycling bin lid");

        super.throwWaste();
        System.out.println("Throwing recyclable waste into the recycling bin");

        super.closeLid();
        System.out.println("Closing the recycling bin lid securely");

        super.emptyDustbin();
        System.out.println("Emptying the recycling bin at a recycling facility");
    }
}