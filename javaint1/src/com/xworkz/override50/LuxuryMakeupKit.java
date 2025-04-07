package com.xworkz.override50;

public class LuxuryMakeupKit extends MakeupKit {
    public LuxuryMakeupKit() {
        super();
        System.out.println("Running non-arg constructor LuxuryMakeupKit--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Luxury makeup kit brand is high-end--child");
    }

    @Override
    public void getContents() {
        System.out.println("Luxury makeup kit contains premium makeup products--child");
    }

    @Override
    public void getSize() {
        System.out.println("Luxury makeup kit size is large with extra compartments--child");
    }

    @Override
    public void getColor() {
        System.out.println("Luxury makeup kit color is gold, silver, or designer shades--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Luxury makeup kit price is high--child");
    }

    public void getPackaging() {
        System.out.println("Luxury makeup kit comes in a stylish, elegant packaging--child only method");
    }
}