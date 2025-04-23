package com.xworkz.Interface.Internal;

public class LuxuryFortunerPackagerImpl implements FortunerPackager {
    public LuxuryFortunerPackagerImpl() {
        System.out.println("No-arg constructor of LuxuryFortunerPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing Fortuner using Luxury Fortuner Packager");
    }
}
