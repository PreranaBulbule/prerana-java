package Software.Intern;

public class USB3PenDrive extends PenDrive {
    public USB3PenDrive() {
        super();
        System.out.println("No-args constructor of USB3PenDrive");

        super.connect();
        System.out.println("Connecting the USB 3.0 pen drive for faster data access");

        super.transferData();
        System.out.println("Transferring data at high speed using USB 3.0");

        super.eject();
        System.out.println("Safely ejecting the USB 3.0 pen drive");

        super.storeData();
        System.out.println("Storing large files quickly on the USB 3.0 pen drive");
    }
}