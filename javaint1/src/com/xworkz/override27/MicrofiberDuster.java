package com.xworkz.override27;

public class MicrofiberDuster extends Duster {
    public MicrofiberDuster() {
        super();
        System.out.println("Running non-arg constructor MicrofiberDuster--child");
    }

    @Override
    public void getBrand() {
        System.out.println("MicrofiberDuster brand is XYZ--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("MicrofiberDuster is made of microfiber--child");
    }

    @Override
    public void getSize() {
        System.out.println("MicrofiberDuster size is 10 inches--child");
    }

    @Override
    public void getColor() {
        System.out.println("MicrofiberDuster color is blue--child");
    }

    @Override
    public void getPrice() {
        System.out.println("MicrofiberDuster price is $5--child");
    }

    public void getWashability() {
        System.out.println("MicrofiberDuster is washable and reusable--child only method");
    }
}