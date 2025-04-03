package Software.Intern;

public class SkinnyJeans extends Jeans {
    public SkinnyJeans() {
        super();
        System.out.println("No-args constructor of SkinnyJeans");

        super.wearJeans();
        System.out.println("Wearing Skinny Jeans");

        super.washJeans();
        System.out.println("Washing Skinny Jeans");

        super.foldJeans();
        System.out.println("Folding Skinny Jeans");

        super.ironJeans();
        System.out.println("Ironing Skinny Jeans");
    }
}
