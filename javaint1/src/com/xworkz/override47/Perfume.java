package com.xworkz.override47;

public class Perfume {
    public Perfume() {
        System.out.println("Running non-arg constructor Perfume--parent");
    }

    public void getBrand() {
        System.out.println("Perfume brand is generic--parent");
    }

    public void getFragrance() {
        System.out.println("Perfume fragrance is floral, woody, or citrus--parent");
    }

    public void getSize() {
        System.out.println("Perfume comes in 30ml, 50ml, and 100ml bottles--parent");
    }

    public void getPrice() {
        System.out.println("Perfume price varies depending on the brand and size--parent");
    }

    public void getBottleType() {
        System.out.println("Perfume bottle is made of glass--parent");
    }

}
