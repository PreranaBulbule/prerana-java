package com.xworkz.override4;

public class PlateContainer {
    public void manage(Plate plate) {
        plate.getMaterial();
        plate.getSize();
        plate.getColor();
        plate.getShape();
        plate.getPrice();

        if(plate instanceof CeramicPlate) {
            System.out.println("Plate is instance of CeramicPlate");
            CeramicPlate ceramicPlate = (CeramicPlate) plate;
            ceramicPlate.microwaveSafe();
        }
    }
}

