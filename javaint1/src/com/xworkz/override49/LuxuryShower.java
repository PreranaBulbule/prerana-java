package com.xworkz.override49;

public class LuxuryShower extends Shower {
    public LuxuryShower() {
        super();
        System.out.println("Running non-arg constructor LuxuryShower--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Luxury Shower is made of high-end materials like stainless steel and brass--child");
    }

    @Override
    public void getSize() {
        System.out.println("Luxury Shower size is larger with extra features--child");
    }

    @Override
    public void getWeight() {
        System.out.println("Luxury Shower weight is heavy due to premium material--child");
    }

    @Override
    public void getColor() {
        System.out.println("Luxury Shower color is gold, silver, or chrome finish--child");
    }

    @Override
    public void getFunction() {
        System.out.println("Luxury Shower provides an enhanced bathing experience with special features--child");
    }

    public void getWaterPressure() {
        System.out.println("Luxury Shower provides adjustable high water pressure--child only method");
    }
}