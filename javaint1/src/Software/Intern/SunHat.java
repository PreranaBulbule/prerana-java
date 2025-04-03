package Software.Intern;

public class SunHat extends Hat {
    public SunHat() {
        super();
        System.out.println("No-args constructor of SunHat");

        super.wear();
        System.out.println("Wearing the sun hat to protect from UV rays");

        super.adjust();
        System.out.println("Adjusting the sun hat strap for a secure fit");

        super.remove();
        System.out.println("Taking off the sun hat carefully");

        super.store();
        System.out.println("Keeping the sun hat in a cool, dry place");
    }
}