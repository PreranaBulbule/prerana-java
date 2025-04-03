package Software.Intern;

public class MapleLeaf  extends Leaf {
    public MapleLeaf() {
        super();
        System.out.println("No-args constructor of MapleLeaf");

        super.photosynthesize();
        System.out.println("The maple leaf absorbs sunlight for energy");

        super.changeColor();
        System.out.println("The maple leaf turns red in autumn");

        super.fall();
        System.out.println("The maple leaf gently falls to the ground");

        super.store();
        System.out.println("Keeping the maple leaf as a souvenir");
    }
}