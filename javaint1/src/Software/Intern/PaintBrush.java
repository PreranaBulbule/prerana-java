package Software.Intern;

public class PaintBrush extends Brush {
    public PaintBrush() {
        super();
        System.out.println("No-args constructor of PaintBrush");

        super.useBrush();
        System.out.println("Using a paintbrush for painting");

        super.cleanBrush();
        System.out.println("Cleaning the paintbrush with water");

        super.storeBrush();
        System.out.println("Storing the paintbrush in a holder");

        super.replaceBrush();
        System.out.println("Replacing an old paintbrush with a new one");
    }
}
