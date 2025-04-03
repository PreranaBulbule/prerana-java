package Software.Intern;

public class AndroidTablet extends Tablet {
    public AndroidTablet() {
        super();
        System.out.println("No-args constructor of AndroidTablet");

        super.powerOn();
        System.out.println("Booting up the Android tablet");

        super.browse();
        System.out.println("Browsing the Play Store on the Android tablet");

        super.playVideo();
        System.out.println("Streaming a video on the Android tablet");

        super.powerOff();
        System.out.println("Shutting down the Android tablet");
    }
}
