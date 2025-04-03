package Software.Intern;

public class MetalPaperclip extends Paperclip {
    public MetalPaperclip() {
        super();
        System.out.println("No-args constructor of MetalPaperclip");

        super.clipPapers();
        System.out.println("Using a metal paperclip for strong grip on documents");

        super.remove();
        System.out.println("Taking off the metal paperclip without damaging pages");

        super.bend();
        System.out.println("Reshaping the metal paperclip for different uses");

        super.store();
        System.out.println("Keeping metal paperclips in a magnetic holder");
    }
}
