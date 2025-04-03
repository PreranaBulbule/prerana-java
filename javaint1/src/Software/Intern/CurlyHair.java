package Software.Intern;

public class CurlyHair extends Hair {
    public CurlyHair() {
        super();
        System.out.println("No-args constructor of CurlyHair");

        super.combHair();
        System.out.println("Combing Curly Hair");

        super.washHair();
        System.out.println("Washing Curly Hair");

        super.dryHair();
        System.out.println("Drying Curly Hair");

        super.cutHair();
        System.out.println("Cutting Curly Hair");
    }
}
