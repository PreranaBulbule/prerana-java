package com.xworkz.override21;

public class CottonBedsheet extends Bedsheet {
    public CottonBedsheet() {
        super();
        System.out.println("Running non-arg constructor CottonBedsheet--child");
    }

    @Override
    public void getMaterial() {
        System.out.println("Cotton bedsheet material--child");
    }

    @Override
    public void getSize() {
        System.out.println("Cotton bedsheet size is king size--child");
    }

    @Override
    public void getColor() {
        System.out.println("Cotton bedsheet color is white--child");
    }

    @Override
    public void getPrice() {
        System.out.println("Cotton bedsheet price is $30--child");
    }

    @Override
    public void getPattern() {
        System.out.println("Cotton bedsheet has floral pattern--child");
    }

    public void getThreadCount() {
        System.out.println("Cotton bedsheet has 300 thread count--child only method");
    }
}