package com.xworkz.override15;

public class OrangeJuice extends Juice {
    public OrangeJuice() {
        super();
        System.out.println("Running non-arg constructor OrangeJuice--child");
    }

    @Override
    public void getFlavor() {
        System.out.println("Orange juice flavor is tangy and citrusy--child");
    }

    @Override
    public void getColor() {
        System.out.println("Orange juice color is orange--child");
    }

    @Override
    public void getSize() {
        System.out.println("Orange juice size is 250 ml--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Orange juice price is $2 per bottle--child");
    }

    @Override
    public void getType() {
        System.out.println("Orange juice is a type of fruit juice--child");
    }

    public void getVitaminCContent() {
        System.out.println("Orange juice contains a high amount of Vitamin C--child only method");
    }
}