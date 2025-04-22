package com.xworkz.Interface.Internal;

public class SeaSaltPackagerImpl implements SaltPackager {
    public SeaSaltPackagerImpl() {
        System.out.println("No-arg constructor of SeaSaltPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing salt using Sea Salt Packager");
    }
}
