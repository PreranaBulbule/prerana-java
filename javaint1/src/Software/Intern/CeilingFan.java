package Software.Intern;

public class CeilingFan extends Fan {
    public CeilingFan() {
        super();
        System.out.println("No-args constructor of CeilingFan");

        super.switchOn();
        System.out.println("Turning on the ceiling fan");

        super.adjustSpeed();
        System.out.println("Adjusting ceiling fan speed using the regulator");

        super.rotate();
        System.out.println("Ceiling fan is rotating smoothly");

        super.switchOff();
        System.out.println("Turning off the ceiling fan");
    }
}