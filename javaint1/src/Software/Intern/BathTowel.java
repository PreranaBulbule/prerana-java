package Software.Intern;

public class BathTowel extends Towel {
    public BathTowel() {
        super();
        System.out.println("No-args constructor of BathTowel");

        super.use();
        System.out.println("Using the bath towel after a shower");

        super.wash();
        System.out.println("Washing the bath towel with warm water");

        super.dry();
        System.out.println("Hanging the bath towel to dry properly");

        super.store();
        System.out.println("Folding and storing the bath towel neatly");
    }
}