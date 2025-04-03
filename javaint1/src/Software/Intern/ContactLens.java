package Software.Intern;

public class ContactLens extends Lens {
    public ContactLens() {
        super();
        System.out.println("No-args constructor of ContactLens");

        super.wearLens();
        System.out.println("Wearing Contact Lenses");

        super.cleanLens();
        System.out.println("Cleaning Contact Lenses");

        super.storeLens();
        System.out.println("Storing Contact Lenses safely");

        super.removeLens();
        System.out.println("Removing Contact Lenses");
    }
}
