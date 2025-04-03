package Software.Intern;

public class MechanicalPencil  extends Pencil {
    public MechanicalPencil() {
        super();
        System.out.println("No-args constructor of MechanicalPencil");

        super.write();
        System.out.println("Writing with the mechanical pencil using lead");

        super.sharpen();
        System.out.println("No need to sharpen the mechanical pencil");

        super.erase();
        System.out.println("Erasing the writing done by the mechanical pencil");

        super.store();
        System.out.println("Keeping the mechanical pencil safely in a case");
    }
}
