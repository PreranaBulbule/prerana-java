package com.xworkz.override50;

public class MakeupKit {
    public MakeupKit() {
        System.out.println("Running non-arg constructor MakeupKit--parent");
    }

    public void getBrand() {
        System.out.println("Makeup kit brand is generic--parent");
    }

    public void getContents() {
        System.out.println("Makeup kit contains basic makeup products--parent");
    }

    public void getSize() {
        System.out.println("Makeup kit size is standard--parent");
    }

    public void getColor() {
        System.out.println("Makeup kit color is typically black, red, or pink--parent");
    }

    public void getPrice() {
        System.out.println("Makeup kit price is moderate--parent");
    }
}
