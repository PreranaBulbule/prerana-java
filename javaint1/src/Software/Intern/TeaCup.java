package Software.Intern;

public class TeaCup extends Cup {
    public TeaCup() {
        super();
        System.out.println("No-args constructor of TeaCup");

        super.fill();
        System.out.println("Filling the teacup with hot tea");

        super.drink();
        System.out.println("Sipping the tea from the teacup");

        super.wash();
        System.out.println("Washing the teacup carefully");

        super.store();
        System.out.println("Storing the teacup safely in the cupboard");
    }
}
