package Software.Intern;

public class ChocolateIceCream extends IceCream {
    public ChocolateIceCream() {
        super();
        System.out.println("No-args constructor of ChocolateIceCream");

        super.prepare();
        System.out.println("Mixing chocolate flavor into the ice cream base");

        super.freeze();
        System.out.println("Freezing the chocolate ice cream mixture to the perfect consistency");

        super.serve();
        System.out.println("Serving the chocolate ice cream with chocolate chips");

        super.eat();
        System.out.println("Enjoying the rich and creamy chocolate ice cream");
    }
}
