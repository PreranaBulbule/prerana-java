package com.xworkz.override11;

public class OfficeChair extends Chair {
    public OfficeChair() {
        super();
        System.out.println("Running non-arg constructor OfficeChair--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("OfficeChair material is leather--child");
    }

    @Override
    public void getType() {
        System.out.println("OfficeChair type is ergonomic--child");
    }

    @Override
    public void getColor() {
        System.out.println("OfficeChair color is black--child");
    }

    @Override
    public void getPrice() {
        System.out.println("OfficeChair price is $150--child");
    }

    @Override
    public void getWeight() {
        System.out.println("OfficeChair weight is 12kg--child");
    }

    public void adjustHeight() {
        System.out.println("OfficeChair height is adjustable--child only method");
    }
}