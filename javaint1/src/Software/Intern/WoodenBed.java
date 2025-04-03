package Software.Intern;

public class WoodenBed extends Bed {
    public WoodenBed() {
        super();
        System.out.println("No-args constructor of WoodenBed");

        super.sleepOnBed();
        System.out.println("Sleeping on a sturdy wooden bed");

        super.makeBed();
        System.out.println("Making a wooden bed with fresh sheets");

        super.cleanBed();
        System.out.println("Dusting and polishing the wooden bed");

        super.moveBed();
        System.out.println("Moving the wooden bed carefully");
    }
}
