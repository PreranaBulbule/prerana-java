package Software.Intern;

public class MatteLipstick extends Lipstick {
    public MatteLipstick() {
        super();
        System.out.println("No-args constructor of MatteLipstick");

        super.applyLipstick();
        System.out.println("Applying Matte Lipstick");

        super.removeLipstick();
        System.out.println("Removing Matte Lipstick");

        super.storeLipstick();
        System.out.println("Storing Matte Lipstick");

        super.checkShade();
        System.out.println("Checking Matte Lipstick shade");
    }
}
