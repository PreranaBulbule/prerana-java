package Software.Intern;

public class Chips extends Snacks {
    public Chips() {
        super();
        System.out.println("No-args constructor of Chips");

        super.prepare();
        System.out.println("Preparing crispy potato chips");

        super.pack();
        System.out.println("Packing chips in airtight packets to maintain freshness");

        super.sell();
        System.out.println("Selling chips in supermarkets and snack shops");

        super.eat();
        System.out.println("Enjoying crunchy and flavorful chips");
    }
}

