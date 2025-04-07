package com.xworkz.override30;

public class GoldChain extends Chain {
    public GoldChain() {
        super();
        System.out.println("Running non-arg constructor GoldChain--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("GoldChain is made of gold--child");
    }

    @Override
    public void getLength() {
        System.out.println("GoldChain length is 45 cm--child");
    }

    @Override
    public void getType() {
        System.out.println("GoldChain is a necklace type--child");
    }

    @Override
    public void getColor() {
        System.out.println("GoldChain color is golden--child");
    }

    @Override
    public void getPrice() {
        System.out.println("GoldChain price is $500--child");
    }

    public void getPurity() {
        System.out.println("GoldChain purity is 24K--child only method");
    }
}