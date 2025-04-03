package Software.Intern;

public class FictionBook extends Book {
    public FictionBook() {
        super();
        System.out.println("No-args constructor of FictionBook");

        super.readBook();
        System.out.println("Reading a Fiction Book");

        super.borrowBook();
        System.out.println("Borrowing a Fiction Book");

        super.returnBook();
        System.out.println("Returning a Fiction Book");

        super.reserveBook();
        System.out.println("Reserving a Fiction Book");
    }
}
