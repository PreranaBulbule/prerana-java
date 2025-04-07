package com.xworkz.override6;

public class GamingLaptop extends Laptop {
    public GamingLaptop() {
        super();
        System.out.println("Running non-arg constructor GamingLaptop--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Gaming laptop brand is Alienware--child");
    }

    @Override
    public void getProcessor() {
        System.out.println("Gaming laptop processor is Intel i9--child");
    }

    @Override
    public void getRam() {
        System.out.println("Gaming laptop RAM is 32GB--child");
    }

    @Override
    public void getStorage() {
        System.out.println("Gaming laptop storage is 1TB SSD--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Gaming laptop price is $2000--child");
    }

    public void getGraphicsCard() {
        System.out.println("Gaming laptop has NVIDIA RTX 3080 graphics card--child only method");
    }
}