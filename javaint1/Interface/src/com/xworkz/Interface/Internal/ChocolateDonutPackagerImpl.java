package com.xworkz.Interface.Internal;

public class ChocolateDonutPackagerImpl implements DonutPackager {
    public ChocolateDonutPackagerImpl() {
        System.out.println("No-arg constructor of ChocolateDonutPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing donut using Chocolate Donut Packager");
    }
}
