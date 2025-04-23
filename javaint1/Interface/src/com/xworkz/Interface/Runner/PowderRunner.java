package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Powder;
import com.xworkz.Interface.Internal.CompactPowderPackagerImpl;

public class PowderRunner {
    public static void main(String[] args) {
        CompactPowderPackagerImpl packager = new CompactPowderPackagerImpl();
        Powder powder = new Powder(packager);
        powder.startPackaging();
    }
}
