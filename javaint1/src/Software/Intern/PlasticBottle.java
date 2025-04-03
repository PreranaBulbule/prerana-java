package Software.Intern;

public class PlasticBottle extends Bottle {
    public PlasticBottle() {
        super();
        System.out.println("No-args constructor of PlasticBottle");

        super.fillBottle();
        System.out.println("Filling a plastic bottle with water");

        super.drinkFromBottle();
        System.out.println("Drinking from a plastic bottle");

        super.cleanBottle();
        System.out.println("Washing a plastic bottle with soap");

        super.closeBottle();
        System.out.println("Closing a plastic bottle with a screw cap");
    }
}
