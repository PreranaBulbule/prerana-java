package Software.Intern;

public class WallMirror extends Mirror {
    public WallMirror() {
        super();
        System.out.println("No-args constructor of WallMirror");

        super.reflectImage();
        System.out.println("Reflecting an image in a wall-mounted mirror");

        super.cleanMirror();
        System.out.println("Wiping the wall mirror with glass cleaner");

        super.hangMirror();
        System.out.println("Fixing the wall mirror securely");

        super.moveMirror();
        System.out.println("Adjusting the wall mirror for a better view");
    }
}
