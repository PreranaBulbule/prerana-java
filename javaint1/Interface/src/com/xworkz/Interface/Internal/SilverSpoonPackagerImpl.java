package com.xworkz.Interface.Internal;

public class SilverSpoonPackagerImpl implements SpoonPackager {
    public SilverSpoonPackagerImpl() {
        System.out.println("No-arg constructor of SilverSpoonPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing spoon using Silver Spoon Packager");
    }
}
