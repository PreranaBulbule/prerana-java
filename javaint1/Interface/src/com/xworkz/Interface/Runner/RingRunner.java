package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Ring;
import com.xworkz.Interface.Internal.GoldRingPackagerImpl;

public class RingRunner {
    public static void main(String[] args) {
        GoldRingPackagerImpl packager = new GoldRingPackagerImpl();
        Ring ring = new Ring(packager);
        ring.startPackaging();
    }
}
