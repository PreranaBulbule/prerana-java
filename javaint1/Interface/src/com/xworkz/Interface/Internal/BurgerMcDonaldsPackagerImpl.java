package com.xworkz.Interface.Internal;

public class BurgerMcDonaldsPackagerImpl implements McDonaldsPackager {
    public BurgerMcDonaldsPackagerImpl() {
        System.out.println("No-arg constructor of BurgerMcDonaldsPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing McDonald's items using Burger McDonald's Packager");
    }
}
