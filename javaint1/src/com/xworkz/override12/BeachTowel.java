package com.xworkz.override12;

public class BeachTowel extends Towel {
    public BeachTowel() {
        super();
        System.out.println("Running non-arg constructor BeachTowel--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("BeachTowel material is cotton--child");
    }

    @Override
    public void getSize() {
        System.out.println("BeachTowel size is large--child");
    }

    @Override
    public void getColor() {
        System.out.println("BeachTowel color is bright--child");
    }

    @Override
    public void getPrice() {
        System.out.println("BeachTowel price is $20--child");
    }

    @Override
    public void getWeight() {
        System.out.println("BeachTowel weight is 1kg--child");
    }

    public void getDesign() {
        System.out.println("BeachTowel design is striped--child only method");
    }
}