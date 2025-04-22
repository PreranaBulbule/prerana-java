package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Balm;
import com.xworkz.Interface.Internal.TigerBalmPackagerImpl;

public class BalmRunner {
    public static void main(String[] args) {
        TigerBalmPackagerImpl packager = new TigerBalmPackagerImpl();
        Balm balm = new Balm(packager);
        balm.startPackaging();
    }
}
