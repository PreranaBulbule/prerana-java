package com.xworkz.override8;

public class Smartphone extends Mobile {
    public Smartphone() {
        super();
        System.out.println("Running non-arg constructor Smartphone--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Smartphone brand is Apple--child");
    }

    @Override
    public void getModel() {
        System.out.println("Smartphone model is iPhone 14--child");
    }

    @Override
    public void getProcessor() {
        System.out.println("Smartphone processor is A15 Bionic--child");
    }

    @Override
    public void getStorage() {
        System.out.println("Smartphone storage is 128GB--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Smartphone price is $999--child");
    }

    public void getCamera() {
        System.out.println("Smartphone camera is 12MP--child only method");
    }
}
