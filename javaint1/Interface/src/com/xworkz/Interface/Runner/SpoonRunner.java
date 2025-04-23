package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Spoon;
import com.xworkz.Interface.Internal.SilverSpoonPackagerImpl;

public class SpoonRunner {
    public static void main(String[] args) {
        SilverSpoonPackagerImpl packager = new SilverSpoonPackagerImpl();
        Spoon spoon = new Spoon(packager);
        spoon.startPackaging();
    }
}
