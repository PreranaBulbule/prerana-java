package Software.Intern;

public class HouseKey extends Key {
    public HouseKey() {
        super();
        System.out.println("No-args constructor of HouseKey");

        super.insert();
        System.out.println("Inserting the house key into the door lock");

        super.turn();
        System.out.println("Turning the house key to unlock the door");

        super.remove();
        System.out.println("Removing the house key after unlocking");

        super.store();
        System.out.println("Keeping the house key in a key holder");
    }
}
