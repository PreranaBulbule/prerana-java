package Software.Intern;

public class GlassWindow extends Window {
    public GlassWindow() {
        super();
        System.out.println("No-args constructor of GlassWindow");

        super.open();
        System.out.println("Opening the glass window carefully to avoid breakage");

        super.close();
        System.out.println("Closing the glass window smoothly");

        super.clean();
        System.out.println("Cleaning the glass window with a special glass cleaner");

        super.lock();
        System.out.println("Locking the glass window with a secure latch");
    }
}
