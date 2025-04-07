package com.xworkz.override20;

public class CardboardBox extends Box {
    public CardboardBox() {
        super();
        System.out.println("Running non-arg constructor CardboardBox--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Cardboard box material--child");
    }

    @Override
    public void getSize() {
        System.out.println("Cardboard box size is medium--child");
    }

    @Override
    public void getColor() {
        System.out.println("Cardboard box color is brown--child");
    }

    @Override
    public void getWeight() {
        System.out.println("Cardboard box weight is light--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Cardboard box price is $5--child");
    }

    public void getDurability() {
        System.out.println("Cardboard box is durable for medium use--child only method");
    }
}