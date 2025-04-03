package Software.Intern;

public class WoodenDoor extends Door {
    public WoodenDoor() {
        super();
        System.out.println("No-args constructor of WoodenDoor");

        super.openDoor();
        System.out.println("Opening a sturdy wooden door");

        super.closeDoor();
        System.out.println("Closing the wooden door gently");

        super.lockDoor();
        System.out.println("Locking the wooden door securely");

        super.unlockDoor();
        System.out.println("Unlocking the wooden door with a key");
    }
}