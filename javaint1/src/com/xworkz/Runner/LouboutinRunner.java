package com.xworkz.Runner;
import com.xworkz.override32.Louboutin;
import com.xworkz.override32.RedSoleLouboutin;
import com.xworkz.override32.ShoeStore;

public class LouboutinRunner {
    public static void main(String[] args) {
        Louboutin louboutin1 = new Louboutin();
        louboutin1.getBrand();
        louboutin1.getColor();
        louboutin1.getSize();
        louboutin1.getPrice();
        louboutin1.getType();

        System.out.println("-------------------");
        Louboutin louboutin2 = new RedSoleLouboutin();
        louboutin2.getBrand();
        louboutin2.getColor();
        louboutin2.getSize();
        louboutin2.getPrice();
        louboutin2.getType();

        System.out.println("-----------------");
        RedSoleLouboutin redSoleLouboutin = new RedSoleLouboutin();
        redSoleLouboutin.getBrand();
        redSoleLouboutin.getColor();
        redSoleLouboutin.getSize();
        redSoleLouboutin.getPrice();
        redSoleLouboutin.getType();
        redSoleLouboutin.getIconicRedSole();

        System.out.println("------------------");
        ShoeStore shoeStore = new ShoeStore();
        shoeStore.manage(louboutin2);
        shoeStore.manage(louboutin1);
        shoeStore.manage(redSoleLouboutin);
    }
}
