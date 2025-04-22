package com.xworkz.Interface.Internal;

public class MicrofiberDusterPackagerImpl implements DusterPackager {
    public MicrofiberDusterPackagerImpl() {
        System.out.println("No-arg constructor of MicrofiberDusterPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing duster using Microfiber Duster Packager");
    }
}
