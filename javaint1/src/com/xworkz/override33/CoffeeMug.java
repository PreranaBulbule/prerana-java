package com.xworkz.override33;

public class CoffeeMug extends Mug {
    public CoffeeMug() {
        super();
        System.out.println("Running non-arg constructor CoffeeMug--child");
    }

    @Override
    public void getBrand() {
        System.out.println("CoffeeMug brand: CeramicMugs--child");
    }

    @Override
    public void getColor() {
        System.out.println("CoffeeMug color: White with a black handle--child");
    }

    @Override
    public void getSize() {
        System.out.println("CoffeeMug size: 12oz--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("CoffeeMug material: Ceramic--child");
    }

    @Override
    public void getPrice() {
        System.out.println("CoffeeMug price: $5--child");
    }

    public void getHandleType() {
        System.out.println("CoffeeMug has a comfortable handle for easy grip--child only method");
    }
}