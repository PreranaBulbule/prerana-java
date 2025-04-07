package com.xworkz.override19;

public class GoldRing extends Ring {
    public GoldRing() {
        super();
        System.out.println("Running non-arg constructor GoldRing--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Gold ring material--child");
    }

    @Override
    public void getSize() {
        System.out.println("Gold ring size is medium--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Gold ring price is $500--child");
    }

    @Override
    public void getColor() {
        System.out.println("Gold ring color is golden--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Gold ring brand is Tanishq--child");
    }

    public void getCarat() {
        System.out.println("Gold ring has 22 carat--child only method");
    }
}