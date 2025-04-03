package Software.Intern;

public class SmartRefrigerator extends Refrigerator {
    public SmartRefrigerator() {
        super();
        System.out.println("No-args constructor of SmartRefrigerator");

        super.cool();
        System.out.println("Maintaining optimal temperature with smart sensors");

        super.freeze();
        System.out.println("Fast-freezing items with energy-efficient technology");

        super.store();
        System.out.println("Organizing food items with smart compartments");

        super.defrost();
        System.out.println("Automatic defrosting enabled in the smart refrigerator");
    }
}

