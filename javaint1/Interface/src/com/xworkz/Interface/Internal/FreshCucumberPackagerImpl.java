package com.xworkz.Interface.Internal;

public class FreshCucumberPackagerImpl implements CucumberPackager {
    public FreshCucumberPackagerImpl() {
        System.out.println("No-arg constructor of FreshCucumberPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing cucumber using Fresh Cucumber Packager");
    }
}
