package Software.Intern;

public class WinterGloves extends Gloves {
    public WinterGloves() {
        super();
        System.out.println("No-args constructor of WinterGloves");

        super.wear();
        System.out.println("Wearing winter gloves to keep hands warm");

        super.remove();
        System.out.println("Taking off the winter gloves after use");

        super.clean();
        System.out.println("Washing the winter gloves to keep them fresh");

        super.store();
        System.out.println("Keeping the winter gloves in a wardrobe");
    }
}
