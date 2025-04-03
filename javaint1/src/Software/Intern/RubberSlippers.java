package Software.Intern;

public class RubberSlippers extends Slippers {
    public RubberSlippers() {
        super();
        System.out.println("No-args constructor of RubberSlippers");

        super.wear();
        System.out.println("Wearing rubber slippers for better grip on wet surfaces");

        super.remove();
        System.out.println("Taking off the rubber slippers after use");

        super.clean();
        System.out.println("Washing the rubber slippers to keep them hygienic");

        super.store();
        System.out.println("Keeping the rubber slippers in a dry place");
    }
}
