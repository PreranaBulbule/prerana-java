package com.xworkz.Runner;
import com.xworkz.override4.Plate;
import com.xworkz.override4.PlateContainer;
import com.xworkz.override4.CeramicPlate;

public class PlateRunner {
    public static void main(String[] args) {
        Plate plate1 = new Plate();
        plate1.getMaterial();
        plate1.getSize();
        plate1.getColor();
        plate1.getShape();
        plate1.getPrice();

        System.out.println("-------------------");
        Plate plate2 = new CeramicPlate();
        plate2.getMaterial();
        plate2.getSize();
        plate2.getColor();
        plate2.getShape();
        plate2.getPrice();

        System.out.println("-----------------");
        CeramicPlate ceramicPlate = new CeramicPlate();
        ceramicPlate.getMaterial();
        ceramicPlate.getSize();
        ceramicPlate.getColor();
        ceramicPlate.getShape();
        ceramicPlate.getPrice();
        ceramicPlate.microwaveSafe();

        System.out.println("------------------");
        PlateContainer plateContainer = new PlateContainer();
        plateContainer.manage(plate2);
        plateContainer.manage(plate1);
        plateContainer.manage(ceramicPlate);
    }
}