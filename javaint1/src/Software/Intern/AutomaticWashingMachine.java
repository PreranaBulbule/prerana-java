package Software.Intern;

public class AutomaticWashingMachine  extends WashingMachine {
    public AutomaticWashingMachine() {
        super();
        System.out.println("No-args constructor of AutomaticWashingMachine");

        super.startMachine();
        System.out.println("Starting the automatic washing machine");

        super.washClothes();
        System.out.println("Washing clothes with different washing modes");

        super.rinseClothes();
        System.out.println("Rinsing clothes with minimal water usage");

        super.stopMachine();
        System.out.println("Automatically stopping after the cycle is complete");
    }
}