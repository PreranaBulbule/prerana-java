package com.xworkz.override26;

public class ChefKnife extends Knife {
    public ChefKnife() {
        super();
        System.out.println("Running non-arg constructor ChefKnife--child");
    }

    @Override
    public void getBrand() {
        System.out.println("ChefKnife brand is XYZ--child");
    }

    @Override
    public void getType() {
        System.out.println("ChefKnife is a professional kitchen knife--child");
    }

    @Override
    public void getSize() {
        System.out.println("ChefKnife size is 8 inches--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("ChefKnife is made of stainless steel--child");
    }

    @Override
    public void getPrice() {
        System.out.println("ChefKnife price is $100--child");
    }

    public void getSharpness() {
        System.out.println("ChefKnife has a high level of sharpness--child only method");
    }
}