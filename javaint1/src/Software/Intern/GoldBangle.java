package Software.Intern;

public class GoldBangle extends Bangle {
    public GoldBangle() {
        super();
        System.out.println("No-args constructor of GoldBangle");

        super.wear();
        System.out.println("Wearing the gold bangle for a special occasion");

        super.clean();
        System.out.println("Cleaning the gold bangle with a special gold cleaner");

        super.remove();
        System.out.println("Removing the gold bangle carefully to avoid scratches");

        super.store();
        System.out.println("Storing the gold bangle in a velvet-lined jewelry box");
    }
}
