package com.xworkz.override28;

public class BangleStore {
    public void manage(Bangle bangle) {
        bangle.getBrand();
        bangle.getMaterial();
        bangle.getSize();
        bangle.getColor();
        bangle.getPrice();

        if (bangle instanceof GoldBangle) {
            System.out.println("Bangle is instance of GoldBangle");
            GoldBangle goldBangle = (GoldBangle) bangle;
            goldBangle.getPurity();
        }
    }

}
