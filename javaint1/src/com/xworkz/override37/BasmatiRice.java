package com.xworkz.override37;

public class BasmatiRice extends Rice {
    public BasmatiRice() {
        super();
        System.out.println("Running non-arg constructor BasmatiRice--child");
    }

    @Override
    public void getType() {
        System.out.println("Basmati rice type: Long grain--child");
    }

    @Override
    public void getFlavor() {
        System.out.println("Basmati rice flavor: Aromatic and nutty--child");
    }

    @Override
    public void getGrainSize() {
        System.out.println("Basmati rice grain size: Long--child");
    }

    @Override
    public void getCookingTime() {
        System.out.println("Basmati rice cooking time: 12-15 minutes--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Basmati rice price: $3 to $6 per kg--child");
    }

    public void getOrigin() {
        System.out.println("Basmati rice origin: India and Pakistan--child only method");
    }
}