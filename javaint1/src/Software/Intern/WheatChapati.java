package Software.Intern;

public class WheatChapati extends Chapati {
    public WheatChapati() {
        super();
        System.out.println("No-args constructor of WheatChapati");

        super.make();
        System.out.println("Making the wheat chapati using whole wheat flour");

        super.cook();
        System.out.println("Cooking the wheat chapati with a little butter for extra taste");

        super.serve();
        System.out.println("Serving the wheat chapati with ghee and pickle");

        super.store();
        System.out.println("Storing the wheat chapati in an insulated container");
    }
}
