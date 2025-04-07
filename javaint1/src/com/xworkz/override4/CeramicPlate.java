package com.xworkz.override4;

public class CeramicPlate extends Plate {
    public CeramicPlate() {
        super();
        System.out.println("Running non-arg constructor CeramicPlate--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Ceramic is the material of the plate--child");
    }

    @Override
    public void getSize() {
        System.out.println("Ceramic plate size is medium--child");
    }

    @Override
    public void getColor() {
        System.out.println("Ceramic plate color is white--child");
    }

    @Override
    public void getShape() {
        System.out.println("Ceramic plate shape is round--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Ceramic plate price is $15--child");
    }

    public void microwaveSafe() {
        System.out.println("Ceramic plate is microwave safe--child only method");
    }
}
