package Software.Intern;

public class Teaspoon extends Spoon {
    public Teaspoon() {
        super();
        System.out.println("No-args constructor of Teaspoon");

        super.scoop();
        System.out.println("Scooping sugar with the teaspoon");

        super.stir();
        System.out.println("Stirring tea or coffee with the teaspoon");

        super.serve();
        System.out.println("Using the teaspoon to serve small portions");

        super.clean();
        System.out.println("Washing the teaspoon after use");
    }
}