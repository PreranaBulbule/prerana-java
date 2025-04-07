package com.xworkz.override9;

public class Smartwatch extends Watch {
    public Smartwatch() {
        super();
        System.out.println("Running non-arg constructor Smartwatch--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Smartwatch brand is Apple--child");
    }

    @Override
    public void getType() {
        System.out.println("Smartwatch type is Wearable--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Smartwatch material is stainless steel--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Smartwatch price is $399--child");
    }

    @Override
    public void getBatteryLife() {
        System.out.println("Smartwatch battery life is 18 hours--child");
    }

    public void getFeatures() {
        System.out.println("Smartwatch features include fitness tracking and notifications--child only method");
    }
}