package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Zip;
import com.xworkz.Interface.Internal.PlasticZipPackagerImpl;

public class ZipRunner {
    public static void main(String[] args) {
        PlasticZipPackagerImpl packager = new PlasticZipPackagerImpl();
        Zip zip = new Zip(packager);
        zip.startPackaging();
    }
}
