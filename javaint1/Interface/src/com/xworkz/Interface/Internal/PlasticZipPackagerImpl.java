package com.xworkz.Interface.Internal;

public class PlasticZipPackagerImpl implements ZipPackager {
    public PlasticZipPackagerImpl() {
        System.out.println("No-arg constructor of PlasticZipPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing zip using Plastic Zip Packager");
    }
}
