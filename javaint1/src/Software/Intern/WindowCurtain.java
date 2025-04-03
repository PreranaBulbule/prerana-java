package Software.Intern;

public class WindowCurtain extends Curtain {
    public WindowCurtain() {
        super();
        System.out.println("No-args constructor of WindowCurtain");

        super.open();
        System.out.println("Drawing back the window curtain to enjoy the view");

        super.close();
        System.out.println("Pulling the window curtain to block sunlight");

        super.wash();
        System.out.println("Washing the window curtain gently to maintain its fabric");

        super.store();
        System.out.println("Folding and storing the window curtain safely");
    }
}