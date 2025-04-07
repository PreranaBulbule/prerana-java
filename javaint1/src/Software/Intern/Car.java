package Software.Intern;

public class Car extends Vehicle {
    public Car() {
        super();
        System.out.println("No-args constructor of Car");

        super.startEngine();
        System.out.println("Starting engine in Car");

        super.accelerate();
        System.out.println("Car is accelerating");

        super.applyBrakes();
        System.out.println("Applying brakes in Car");

        super.refuel();
        System.out.println("Refueling Car");

    }
}

