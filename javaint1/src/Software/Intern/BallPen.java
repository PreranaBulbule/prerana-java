package Software.Intern;

public class BallPen extends Pen {
    public BallPen() {
        super();
        System.out.println("No-args constructor of BallPen");

        super.write();
        System.out.println("Writing with a Ball Pen");

        super.refill();
        System.out.println("Refilling a Ball Pen");

        super.capOn();
        System.out.println("Putting the cap on a Ball Pen");

        super.capOff();
        System.out.println("Removing the cap from a Ball Pen");
    }
}