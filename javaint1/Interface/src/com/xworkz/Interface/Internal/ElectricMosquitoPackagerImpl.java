package com.xworkz.Interface.Internal;

public class ElectricMosquitoPackagerImpl implements MosquitoPackager {
    public ElectricMosquitoPackagerImpl() {
        System.out.println("No-arg constructor of ElectricMosquitoPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing mosquito repellent using Electric Mosquito Packager");
    }
}
