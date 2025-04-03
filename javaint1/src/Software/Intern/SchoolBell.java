package Software.Intern;

public class SchoolBell extends Bell {
    public SchoolBell() {
        super();
        System.out.println("No-args constructor of SchoolBell");

        super.ring();
        System.out.println("Ringing the school bell to signal class changes");

        super.stop();
        System.out.println("Stopping the school bell after the required duration");

        super.clean();
        System.out.println("Regularly maintaining the school bell for clear sound");

        super.store();
        System.out.println("Ensuring the school bell is well-protected from rust");
    }
}
