package com.xworkz.override25;

public class SmartTV extends TV {
    public SmartTV() {
        super();
        System.out.println("Running non-arg constructor SmartTV--child");
    }

    @Override
    public void getBrand() {
        System.out.println("SmartTV brand is XYZ--child");
    }

    @Override
    public void getSize() {
        System.out.println("SmartTV size is 55 inches--child");
    }

    @Override
    public void getType() {
        System.out.println("SmartTV is a type of smart television--child");
    }

    @Override
    public void getPrice() {
        System.out.println("SmartTV price is $800--child");
    }

    @Override
    public void getResolution() {
        System.out.println("SmartTV resolution is 4K--child");
    }

    public void getSmartFeatures() {
        System.out.println("SmartTV has built-in apps and Wi-Fi--child only method");
    }
}