package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Nail;
import com.xworkz.Interface.Internal.IronNailPackagerImpl;

public class NailRunner {
    public static void main(String[] args) {
        IronNailPackagerImpl packager = new IronNailPackagerImpl();
        Nail nail = new Nail(packager);
        nail.startPackaging();
    }
}
