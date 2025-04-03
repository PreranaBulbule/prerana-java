package Software.Intern;

public class ElectricBus extends Bus {
    public ElectricBus() {
        super();
        System.out.println("No-args constructor of ElectricBus");

        super.startBus();
        System.out.println("Starting the electric bus silently");

        super.driveBus();
        System.out.println("Driving the electric bus with zero emissions");

        super.stopBus();
        System.out.println("Stopping the electric bus using regenerative braking");

        super.parkBus();
        System.out.println("Parking the electric bus at the charging station");
    }
}

