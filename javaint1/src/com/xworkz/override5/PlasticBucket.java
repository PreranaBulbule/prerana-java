package com.xworkz.override5;

public class PlasticBucket extends Bucket {
    public PlasticBucket() {
        super();
        System.out.println("Running non-arg constructor PlasticBucket--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Plastic is the material of the bucket--child");
    }

    @Override
    public void getSize() {
        System.out.println("Plastic bucket size is large--child");
    }

    @Override
    public void getColor() {
        System.out.println("Plastic bucket color is blue--child");
    }

    @Override
    public void getShape() {
        System.out.println("Plastic bucket shape is cylindrical--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Plastic bucket price is $5--child");
    }

    public void handle() {
        System.out.println("Plastic bucket has a handle--child only method");
    }
}