package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Vessel;
import com.xworkz.Interface.Internal.SteelVesselPackagerImpl;

public class VesselRunner {
    public static void main(String[] args) {
        SteelVesselPackagerImpl packager = new SteelVesselPackagerImpl();
        Vessel vessel = new Vessel(packager);
        vessel.startPackaging();
    }
}
