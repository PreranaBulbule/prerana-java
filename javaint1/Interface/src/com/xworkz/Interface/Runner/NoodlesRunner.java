package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Noodles;
import com.xworkz.Interface.Internal.InstantNoodlesPackagerImpl;

public class NoodlesRunner {
    public static void main(String[] args) {
        InstantNoodlesPackagerImpl packager = new InstantNoodlesPackagerImpl();
        Noodles noodles = new Noodles(packager);
        noodles.startPackaging();
    }
}
