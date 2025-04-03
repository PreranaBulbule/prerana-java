package Software.Intern;

public class HairClip extends Clip {
    public HairClip() {
        super();
        System.out.println("No-args constructor of HairClip");

        super.useClip();
        System.out.println("Using a Hair Clip");

        super.openClip();
        System.out.println("Opening a Hair Clip");

        super.closeClip();
        System.out.println("Closing a Hair Clip");

        super.storeClip();
        System.out.println("Storing a Hair Clip");
    }
}
