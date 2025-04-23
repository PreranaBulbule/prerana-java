package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Kfc;
import com.xworkz.Interface.Internal.ChickenKfcPackagerImpl;

public class KfcRunner {
    public static void main(String[] args) {
        ChickenKfcPackagerImpl packager = new ChickenKfcPackagerImpl();
        Kfc kfc = new Kfc(packager);
        kfc.startPackaging();
    }
}
