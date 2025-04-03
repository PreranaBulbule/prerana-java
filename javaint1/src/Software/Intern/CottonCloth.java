package Software.Intern;

public class CottonCloth extends Cloth {
    public CottonCloth() {
        super();
        System.out.println("No-args constructor of CottonCloth");

        super.wearCloth();
        System.out.println("Wearing a comfortable cotton cloth");

        super.washCloth();
        System.out.println("Washing a cotton cloth with mild detergent");

        super.dryCloth();
        System.out.println("Drying a cotton cloth in the shade");

        super.foldCloth();
        System.out.println("Folding a cotton cloth carefully");
    }
}