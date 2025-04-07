package com.xworkz.override28;

public class GoldBangle extends Bangle {
    public GoldBangle() {
        super();
        System.out.println("Running non-arg constructor GoldBangle--child");
    }

    @Override
    public void getBrand() {
        System.out.println("GoldBangle brand is ABC--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("GoldBangle is made of pure gold--child");
    }

    @Override
    public void getSize() {
        System.out.println("GoldBangle size is standard--child");
    }

    @Override
    public void getColor() {
        System.out.println("GoldBangle color is golden--child");
    }

    @Override
    public void getPrice() {
        System.out.println("GoldBangle price is $500--child");
    }

    public void getPurity() {
        System.out.println("GoldBangle purity is 24K--child only method");
    }
}