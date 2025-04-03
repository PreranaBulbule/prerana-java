package Software.Intern;

public class CasualShirt extends Shirt {
    public CasualShirt() {
        super();
        System.out.println("No-args constructor of CasualShirt");

        super.wearShirt();
        System.out.println("Wearing a Casual Shirt");

        super.washShirt();
        System.out.println("Washing a Casual Shirt");

        super.foldShirt();
        System.out.println("Folding a Casual Shirt");

        super.ironShirt();
        System.out.println("Ironing a Casual Shirt");
    }
}
