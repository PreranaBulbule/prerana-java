package Software.Intern;

public class PDFDocument extends Document {
    public PDFDocument() {
        super();
        System.out.println("No-args constructor of PDFDocument");

        super.open();
        System.out.println("Opening a PDF document");

        super.edit();
        System.out.println("Editing a PDF document with annotation tools");

        super.save();
        System.out.println("Saving the PDF document as a read-only file");

        super.close();
        System.out.println("Closing the PDF document");
    }
}
