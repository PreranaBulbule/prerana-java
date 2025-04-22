package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Cooker;
import com.xworkz.Interface.Internal.PrestigeCookerPackagerImpl;

public class CookerRunner {
    public static void main(String[] args) {
        PrestigeCookerPackagerImpl packager = new PrestigeCookerPackagerImpl();
        Cooker cooker = new Cooker(packager);
        cooker.startPackaging();
    }
}
