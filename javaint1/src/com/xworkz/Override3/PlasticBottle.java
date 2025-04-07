package com.xworkz.Override3;

public class PlasticBottle extends Bottle {
    public PlasticBottle() {
        super();
        System.out.println("Running non-arg constructor PlasticBottle--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Plastic is the material of the bottle--child");
    }

    @Override
    public void getCapacity() {
        System.out.println("Plastic bottle capacity is 500ml--child");
    }

    @Override
    public void getColor() {
        System.out.println("Plastic bottle color is transparent--child");
    }

    @Override
    public void getShape() {
        System.out.println("Plastic bottle is cylindrical--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Plastic bottle price is $1--child");
    }

    public void recycle() {
        System.out.println("Plastic bottle is recyclable--child only method");
    }
}