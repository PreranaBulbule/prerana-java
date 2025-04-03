package Software.Intern;

public class MineralWater extends Water {
    public MineralWater() {
        super();
        System.out.println("No-args constructor of MineralWater");

        super.drinkWater();
        System.out.println("Drinking mineral water for better health");

        super.boilWater();
        System.out.println("Boiling mineral water is not necessary");

        super.storeWater();
        System.out.println("Storing mineral water in a sealed bottle");

        super.useWater();
        System.out.println("Using mineral water for drinking only");
    }
}
