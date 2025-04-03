package Software.Intern;

public class TableLamp extends Lamp {
    public TableLamp() {
        super();
        System.out.println("No-args constructor of TableLamp");

        super.switchOn();
        System.out.println("Turning on the table lamp for reading");

        super.adjustBrightness();
        System.out.println("Adjusting the table lamp brightness to a comfortable level");

        super.switchOff();
        System.out.println("Turning off the table lamp before sleeping");

        super.replaceBulb();
        System.out.println("Replacing the LED bulb in the table lamp");
    }
}