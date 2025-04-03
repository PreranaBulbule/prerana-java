package Software.Intern;

public class Sunglasses extends Specs {
    public Sunglasses() {
        super();
        System.out.println("No-args constructor of Sunglasses");

        super.wear();
        System.out.println("Wearing sunglasses to protect eyes from sunlight");

        super.clean();
        System.out.println("Cleaning sunglasses with a special lens cleaner");

        super.remove();
        System.out.println("Removing sunglasses and placing them carefully");

        super.store();
        System.out.println("Storing sunglasses in a hard case to prevent damage");
    }
}