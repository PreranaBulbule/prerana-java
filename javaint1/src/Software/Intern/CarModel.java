package Software.Intern;

public class CarModel extends Model {
    public CarModel() {
        super();
        System.out.println("No-args constructor of CarModel");

        super.design();
        System.out.println("Designing a car model with aerodynamics");

        super.build();
        System.out.println("Building the car model using 3D printing");

        super.test();
        System.out.println("Testing the car model in a wind tunnel");

        super.display();
        System.out.println("Displaying the car model at an auto expo");
    }
}
