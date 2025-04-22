package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Iron;
import com.xworkz.Interface.Internal.PhilipsIronPackagerImpl;

public class IronRunner {
    public static void main(String[] args) {
        PhilipsIronPackagerImpl packager = new PhilipsIronPackagerImpl();
        Iron iron = new Iron(packager);
        iron.startPackaging();
    }
}
