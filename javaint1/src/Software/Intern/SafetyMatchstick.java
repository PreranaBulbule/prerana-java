package Software.Intern;

public class SafetyMatchstick extends Matchstick {
    public SafetyMatchstick() {
        super();
        System.out.println("No-args constructor of SafetyMatchstick");

        super.ignite();
        System.out.println("Striking the safety matchstick only on the designated surface");

        super.burn();
        System.out.println("Safety matchstick burns with controlled ignition");

        super.extinguish();
        System.out.println("Blowing out the safety matchstick after use");

        super.dispose();
        System.out.println("Ensuring the used safety matchstick is properly discarded");
    }
}