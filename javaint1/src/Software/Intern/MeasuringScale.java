package Software.Intern;

public class MeasuringScale extends Scale {
    public MeasuringScale() {
        super();
        System.out.println("No-args constructor of MeasuringScale");

        super.measure();
        System.out.println("Measuring objects with precision using the measuring scale");

        super.align();
        System.out.println("Ensuring the measuring scale is placed correctly");

        super.clean();
        System.out.println("Wiping the measuring scale for clear markings");

        super.store();
        System.out.println("Keeping the measuring scale safely in a drawer");
    }
}