package Software.Intern;

public class ClimbingRope extends Rope {
    public ClimbingRope() {
        super();
        System.out.println("No-args constructor of ClimbingRope");

        super.tie();
        System.out.println("Tying the climbing rope with strong knots for safety");

        super.untie();
        System.out.println("Untying the climbing rope after use");

        super.coil();
        System.out.println("Coiling the climbing rope properly for maintenance");

        super.store();
        System.out.println("Keeping the climbing rope in a secure and dry place");
    }
}