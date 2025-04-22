package com.xworkz.Interface.Internal;

public class FreshEggPackagerImpl implements EggPackager {
    public FreshEggPackagerImpl() {
        System.out.println("No-arg constructor of FreshEggPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing egg using Fresh Egg Packager");
    }
}
