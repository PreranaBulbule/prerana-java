package com.xworkz.override45;

public class LeatherBelt extends Belt {
    public LeatherBelt() {
        super();
        System.out.println("Running non-arg constructor LeatherBelt--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Leather belt is made of high-quality leather--child");
    }

    @Override
    public void getColor() {
        System.out.println("Leather belt comes in classic colors like black and brown--child");
    }

    @Override
    public void getSize() {
        System.out.println("Leather belt comes in various sizes based on waist measurements--child");
    }

    @Override
    public void getBuckleType() {
        System.out.println("Leather belt has a polished metal buckle--child");
    }

    @Override
    public void getStyle() {
        System.out.println("Leather belt is usually worn with formal or business attire--child");
    }

    public void getDurability() {
        System.out.println("Leather belt is highly durable and long-lasting--child only method");
    }
}