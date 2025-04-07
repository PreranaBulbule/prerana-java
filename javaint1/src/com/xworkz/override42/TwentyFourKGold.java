package com.xworkz.override42;

public class TwentyFourKGold extends Gold {
    public TwentyFourKGold() {
        super();
        System.out.println("Running non-arg constructor TwentyFourKGold--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("24K Gold is made of 100% pure gold--child");
    }

    @Override
    public void getColor() {
        System.out.println("24K Gold is a bright yellow color--child");
    }

    @Override
    public void getPurity() {
        System.out.println("24K Gold has 99.9% purity--child");
    }

    @Override
    public void getPrice() {
        System.out.println("24K Gold is the most expensive due to its purity--child");
    }

    @Override
    public void getWeight() {
        System.out.println("24K Gold weight is also measured in grams or ounces--child");
    }

    public void getGoldUsage() {
        System.out.println("24K Gold is used for making high-end jewelry and investment purposes--child only method");
    }
}