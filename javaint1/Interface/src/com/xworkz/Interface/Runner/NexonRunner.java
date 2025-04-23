package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Nexon;
import com.xworkz.Interface.Internal.ElectricNexonPackagerImpl;

public class NexonRunner {
    public static void main(String[] args) {
        ElectricNexonPackagerImpl packager = new ElectricNexonPackagerImpl();
        Nexon nexon = new Nexon(packager);
        nexon.startPackaging();
    }
}
