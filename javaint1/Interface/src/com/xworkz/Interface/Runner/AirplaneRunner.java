package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Airplane;
import com.xworkz.Interface.Internal.BoeingPackagerImpl;

public class AirplaneRunner {
    public static void main(String[] args) {
        BoeingPackagerImpl packager = new BoeingPackagerImpl();
        Airplane airplane = new Airplane(packager);
        airplane.startPackaging();
    }
}
