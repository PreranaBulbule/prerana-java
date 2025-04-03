package Software.Intern;

public class WoodenBox extends Box {
    public WoodenBox() {
        super();
        System.out.println("No-args constructor of WoodenBox");

        super.open();
        System.out.println("Opening the wooden box with a smooth hinge");

        super.store();
        System.out.println("Storing valuable items in the wooden box");

        super.close();
        System.out.println("Closing the wooden box carefully to prevent scratches");

        super.move();
        System.out.println("Moving the wooden box with care to avoid damage");
    }
}
