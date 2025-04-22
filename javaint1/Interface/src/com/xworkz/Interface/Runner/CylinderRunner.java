package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Cylinder;
import com.xworkz.Interface.Internal.GasCylinderPackagerImpl;

public class CylinderRunner {
    public static void main(String[] args) {
        GasCylinderPackagerImpl packager = new GasCylinderPackagerImpl();
        Cylinder cylinder = new Cylinder(packager);
        cylinder.startPackaging();
    }
}
