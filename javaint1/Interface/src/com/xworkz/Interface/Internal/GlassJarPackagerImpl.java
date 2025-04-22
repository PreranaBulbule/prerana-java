package com.xworkz.Interface.Internal;

public class GlassJarPackagerImpl implements JarPackager {
    public GlassJarPackagerImpl() {
        System.out.println("No-arg constructor of GlassJarPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing jar using Glass Jar Packager");
    }
}
