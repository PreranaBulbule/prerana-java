package Software.Intern;

public class ShirtButton extends Button {
    public ShirtButton() {
        super();
        System.out.println("No-args constructor of ShirtButton");

        super.fasten();
        System.out.println("Buttoning up the shirt for a neat look");

        super.unfasten();
        System.out.println("Unbuttoning the shirt for comfort");

        super.clean();
        System.out.println("Wiping the shirt button to remove dust");

        super.store();
        System.out.println("Keeping spare shirt buttons in a sewing kit");
    }
}
