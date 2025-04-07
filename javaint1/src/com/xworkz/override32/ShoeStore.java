package com.xworkz.override32;

public class ShoeStore {
    public void manage(Louboutin louboutin) {
        louboutin.getBrand();
        louboutin.getColor();
        louboutin.getSize();
        louboutin.getPrice();
        louboutin.getType();

        if (louboutin instanceof RedSoleLouboutin) {
            System.out.println("Louboutin is instance of RedSoleLouboutin");
            RedSoleLouboutin redSoleLouboutin = (RedSoleLouboutin) louboutin;
            redSoleLouboutin.getIconicRedSole();
        }
    }

}
