package com.xworkz.override46;

public class Purse {
    public Purse() {
        System.out.println("Running non-arg constructor Purse--parent");
    }

    public void getMaterial() {
        System.out.println("Purse is made of leather, fabric, or synthetic materials--parent");
    }

    public void getColor() {
        System.out.println("Purse comes in various colors like black, brown, red, and blue--parent");
    }

    public void getSize() {
        System.out.println("Purse size varies from small to large--parent");
    }

    public void getDesign() {
        System.out.println("Purse design can be simple, fancy, or designer--parent");
    }

    public void getClosureType() {
        System.out.println("Purse closure type can be zipper, clasp, or magnetic--parent");
    }
}
