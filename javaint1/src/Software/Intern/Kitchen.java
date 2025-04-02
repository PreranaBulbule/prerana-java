package Software.Intern;

public class Kitchen extends Restaurant {
    public Kitchen() {
        super();
        System.out.println("No-args constructor of Kitchen");

        super.takeOrder();
        System.out.println("Kitchen received order for preparation");

        super.serveFood();
        System.out.println("Kitchen preparing food for service");

        super.processPayment();
        System.out.println("Kitchen updating inventory after payment");

        super.cleanTables();
        System.out.println("Kitchen cleaning cooking area");
    }
}
