package Software.Intern;

public class WhiteChalk extends Chalk {
    public WhiteChalk() {
        super();
        System.out.println("No-args constructor of WhiteChalk");

        super.write();
        System.out.println("Writing clearly on the blackboard using white chalk");

        super.breakChalk();
        System.out.println("Handling white chalk carefully to avoid breaking");

        super.dustOff();
        System.out.println("Cleaning hands after using white chalk");

        super.store();
        System.out.println("Keeping the white chalk in a chalk holder");
    }
}