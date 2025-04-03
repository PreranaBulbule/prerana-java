package Software.Intern;

public class ElectricSharpener extends Sharpener {
    public ElectricSharpener() {
        super();
        System.out.println("No-args constructor of ElectricSharpener");

        super.sharpen();
        System.out.println("Automatically sharpening the pencil with an electric sharpener");

        super.hold();
        System.out.println("Holding the pencil instead of the sharpener for automatic sharpening");

        super.clean();
        System.out.println("Emptying the shavings compartment of the electric sharpener");

        super.store();
        System.out.println("Keeping the electric sharpener safely in a drawer");
    }
}