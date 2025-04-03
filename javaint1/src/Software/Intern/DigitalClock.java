package Software.Intern;

public class DigitalClock extends Clock {
    public DigitalClock() {
        super();
        System.out.println("No-args constructor of DigitalClock");

        super.showTime();
        System.out.println("Displaying time digitally with LED screen");

        super.setAlarm();
        System.out.println("Setting an alarm with a customizable ringtone");

        super.tick();
        System.out.println("Digital clock operates silently without ticking");

        super.stop();
        System.out.println("Turning off the digital clock display");
    }
}
