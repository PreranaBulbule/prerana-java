package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Dispenser;
import com.xworkz.Interface.Internal.AutomaticDispenserPackagerImpl;

public class DispenserRunner {
    public static void main(String[] args) {
        AutomaticDispenserPackagerImpl packager = new AutomaticDispenserPackagerImpl();
        Dispenser dispenser = new Dispenser(packager);
        dispenser.startPackaging();
    }
}
