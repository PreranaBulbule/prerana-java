package com.xworkz.override18;

public class BathSoap extends Soap {
    public BathSoap() {
        super();
        System.out.println("Running non-arg constructor BathSoap--child");
    }

    @Override
    public void getType() {
        System.out.println("Bath soap type--child");
    }

    @Override
    public void getBrand() {
        System.out.println("Bath soap brand is Dove--child");
    }

    @Override
    public void getColor() {
        System.out.println("Bath soap color is white--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Bath soap price is $2--child");
    }

    @Override
    public void getSize() {
        System.out.println("Bath soap size is 100g--child");
    }

    public void getFragrance() {
        System.out.println("Bath soap has a floral fragrance--child only method");
    }
}