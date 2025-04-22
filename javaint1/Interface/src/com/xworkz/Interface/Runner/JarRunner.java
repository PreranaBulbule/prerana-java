package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Jar;
import com.xworkz.Interface.Internal.GlassJarPackagerImpl;

public class JarRunner {
    public static void main(String[] args) {
        GlassJarPackagerImpl packager = new GlassJarPackagerImpl();
        Jar jar = new Jar(packager);
        jar.startPackaging();
    }
}
