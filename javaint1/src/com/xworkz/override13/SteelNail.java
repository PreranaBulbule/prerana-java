package com.xworkz.override13;

public class SteelNail extends Nail {
    public SteelNail() {
        super();
        System.out.println("Running non-arg constructor SteelNail--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("SteelNail material is steel--child");
    }

    @Override
    public void getSize() {
        System.out.println("SteelNail size is 5 inches--child");
    }

    @Override
    public void getColor() {
        System.out.println("SteelNail color is metallic gray--child");
    }

    @Override
    public void getPrice() {
        System.out.println("SteelNail price is $0.10 per unit--child");
    }

    @Override
    public void getWeight() {
        System.out.println("SteelNail weight is 10g--child");
    }

    public void getDurability() {
        System.out.println("SteelNail is highly durable--child only method");
    }
}