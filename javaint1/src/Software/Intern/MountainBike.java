package Software.Intern;

public class MountainBike extends Bicycle {
    public MountainBike() {
        super();
        System.out.println("No-args constructor of MountainBike");

        super.start();
        System.out.println("Starting to ride the mountain bike on rough terrain");

        super.pedal();
        System.out.println("Pedaling the mountain bike with extra force for climbing");

        super.brake();
        System.out.println("Applying disc brakes for better control");

        super.stop();
        System.out.println("Stopping the mountain bike smoothly");
    }
}
