package com.xworkz.Interface.Internal;

public class SmartphoneMobilePackagerImpl implements MobilePackager {
    public SmartphoneMobilePackagerImpl() {
        System.out.println("No-arg constructor of SmartphoneMobilePackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing mobile using Smartphone Mobile Packager");
    }
}
