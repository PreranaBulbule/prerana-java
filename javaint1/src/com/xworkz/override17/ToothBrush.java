package com.xworkz.override17;

public class ToothBrush extends Brush {
    public ToothBrush() {
        super();
        System.out.println("Running non-arg constructor ToothBrush--child");
    }

    @Override
    public void getType() {
        System.out.println("Toothbrush type--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Toothbrush brand is Colgate--child");
    }

    @Override
    public void getColor() {
        System.out.println("Toothbrush color is blue--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Toothbrush price is $3--child");
    }

    @Override
    public void getSize() {
        System.out.println("Toothbrush size is medium--child");
    }

    public void getBristleType() {
        System.out.println("Toothbrush has soft bristles--child only method");
    }
}