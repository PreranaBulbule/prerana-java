package Software.Intern;

public class CeramicPlate extends Plate {
    public CeramicPlate() {
        super();
        System.out.println("No-args constructor of CeramicPlate");

        super.serveFood();
        System.out.println("Serving food on a ceramic plate");

        super.cleanPlate();
        System.out.println("Washing the ceramic plate with care");

        super.storePlate();
        System.out.println("Stacking the ceramic plate properly");

        super.movePlate();
        System.out.println("Handling the ceramic plate carefully");
    }
}
