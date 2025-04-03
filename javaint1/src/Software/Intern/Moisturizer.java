package Software.Intern;

public class Moisturizer extends Skincare {
    public Moisturizer() {
        super();
        System.out.println("No-args constructor of Moisturizer");

        super.applySkincare();
        System.out.println("Applying Moisturizer");

        super.cleanseSkin();
        System.out.println("Cleansing before applying Moisturizer");

        super.moisturizeSkin();
        System.out.println("Moisturizing the skin");

        super.protectSkin();
        System.out.println("Protecting the skin with Moisturizer");
    }
}
