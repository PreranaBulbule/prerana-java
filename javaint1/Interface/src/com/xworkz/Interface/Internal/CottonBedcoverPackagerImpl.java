package com.xworkz.Interface.Internal;

public class CottonBedcoverPackagerImpl implements BedcoverPackager {
    public CottonBedcoverPackagerImpl() {
        System.out.println("No-arg constructor of CottonBedcoverPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing bedcover using Cotton Bedcover Packager");
    }
}
