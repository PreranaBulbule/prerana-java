package com.xworkz.Interface.Internal;

public class LeatherShoePackagerImpl implements ShoePackager {
    public LeatherShoePackagerImpl() {
        System.out.println("No-arg constructor of LeatherShoePackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing shoes using Leather Shoe Packager");
    }
}
