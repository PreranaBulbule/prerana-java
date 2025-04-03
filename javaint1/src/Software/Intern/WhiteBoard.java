package Software.Intern;

public class WhiteBoard extends Board {
    public WhiteBoard() {
        super();
        System.out.println("No-args constructor of WhiteBoard");

        super.writeOnBoard();
        System.out.println("Writing on a WhiteBoard with a marker");

        super.eraseBoard();
        System.out.println("Erasing a WhiteBoard");

        super.cleanBoard();
        System.out.println("Cleaning a WhiteBoard with a duster");

        super.hangBoard();
        System.out.println("Hanging a WhiteBoard in a classroom");
    }
}
