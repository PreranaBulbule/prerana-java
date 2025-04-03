package Software.Intern;

public class InkEraser  extends Eraser {
    public InkEraser() {
        super();
        System.out.println("No-args constructor of InkEraser");

        super.erase();
        System.out.println("Erasing ink marks using a special ink eraser");

        super.hold();
        System.out.println("Holding the ink eraser carefully for precision");

        super.clean();
        System.out.println("Wiping the ink eraser to keep it effective");

        super.store();
        System.out.println("Keeping the ink eraser safely in a case");
    }
}
