package Software.Intern;

public class MangoTree extends Tree {
    public MangoTree() {
        super();
        System.out.println("No-args constructor of MangoTree");

        super.grow();
        System.out.println("The mango tree is growing with lush green leaves");

        super.shedLeaves();
        System.out.println("The mango tree sheds some leaves before flowering");

        super.provideShade();
        System.out.println("The mango tree provides cool shade during summers");

        super.bearFruit();
        System.out.println("The mango tree bears sweet mangoes during the season");
    }
}
