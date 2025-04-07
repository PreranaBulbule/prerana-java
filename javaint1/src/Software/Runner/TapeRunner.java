package Software.Runner;
import Software.Intern.Tape;
import Software.Intern.AdhesiveTape;

public class TapeRunner {
    public static void main(String[] args) {
        Tape tape = new Tape();
        tape.stick();
        tape.cut();
        tape.remove();
        tape.store();
        System.out.println("===========");

        AdhesiveTape adhesiveTape = new AdhesiveTape();
        adhesiveTape.stick();
        adhesiveTape.cut();
        adhesiveTape.remove();
        adhesiveTape.store();
    }
}
