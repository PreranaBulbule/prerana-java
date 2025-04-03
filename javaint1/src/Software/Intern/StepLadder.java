package Software.Intern;

public class StepLadder extends Ladder {
    public StepLadder() {
        super();
        System.out.println("No-args constructor of StepLadder");

        super.climb();
        System.out.println("Using the step ladder for household tasks");

        super.stand();
        System.out.println("Ensuring stability while standing on the step ladder");

        super.fold();
        System.out.println("Folding the step ladder after use");

        super.store();
        System.out.println("Keeping the step ladder in a storage area");
    }
}