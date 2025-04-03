package Software.Intern;

public class PaperCutter extends Cutter {
    public PaperCutter() {
        super();
        System.out.println("No-args constructor of PaperCutter");

        super.cut();
        System.out.println("Cutting paper with the paper cutter");

        super.hold();
        System.out.println("Holding the paper cutter carefully to avoid injury");

        super.clean();
        System.out.println("Wiping the paper cutter blade after use");

        super.store();
        System.out.println("Keeping the paper cutter in a drawer safely");
    }
}