package Software.Intern;

public class MagneticCompass extends Compass {
    public MagneticCompass() {
        super();
        System.out.println("No-args constructor of MagneticCompass");

        super.pointNorth();
        System.out.println("Ensuring the magnetic compass aligns with Earth's magnetic field");

        super.useForNavigation();
        System.out.println("Using the magnetic compass for precise direction finding");

        super.calibrate();
        System.out.println("Calibrating the magnetic compass for better accuracy");

        super.store();
        System.out.println("Keeping the magnetic compass in a dry place to prevent damage");
    }
}