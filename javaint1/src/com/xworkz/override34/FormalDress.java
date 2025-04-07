package com.xworkz.override34;

public class FormalDress extends Dress {
    public FormalDress() {
        super();
        System.out.println("Running non-arg constructor FormalDress--child");
    }

    @Override
    public void getFabric() {
        System.out.println("FormalDress fabric: Wool or Cotton--child");
    }

    @Override
    public void getColor() {
        System.out.println("FormalDress color: Black or Navy--child");
    }

    @Override
    public void getSize() {
        System.out.println("FormalDress size: Available in all standard sizes--child");
    }

    @Override
    public void getStyle() {
        System.out.println("FormalDress style: Business formal--child");
    }

    @Override
    public void getPrice() {
        System.out.println("FormalDress price: $100--child");
    }

    public void getOccasion() {
        System.out.println("FormalDress is suitable for office or formal events--child only method");
    }
}