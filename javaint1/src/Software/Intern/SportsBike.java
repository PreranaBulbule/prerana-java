package Software.Intern;

public class SportsBike extends Bike {
    public SportsBike() {
        super();
        System.out.println("No-args constructor of SportsBike");

        super.startBike();
        System.out.println("Starting a high-performance sports bike");

        super.rideBike();
        System.out.println("Riding the sports bike at high speed");

        super.stopBike();
        System.out.println("Applying disc brakes to stop the sports bike");

        super.parkBike();
        System.out.println("Parking the sports bike in the garage");
    }
}