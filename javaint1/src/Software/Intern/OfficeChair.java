package Software.Intern;

public class OfficeChair extends Chair {
    public OfficeChair() {
        super();
        System.out.println("No-args constructor of OfficeChair");

        super.sitOn();
        System.out.println("Sitting on an Office Chair");

        super.moveChair();
        System.out.println("Moving an Office Chair");

        super.adjustHeight();
        System.out.println("Adjusting the height of an Office Chair");

        super.foldChair();
        System.out.println("Folding an Office Chair");
    }
}
