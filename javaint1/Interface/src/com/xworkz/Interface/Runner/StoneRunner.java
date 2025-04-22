package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Stone;
import com.xworkz.Interface.Internal.GraniteStonePackagerImpl;

public class StoneRunner {
    public static void main(String[] args) {
        GraniteStonePackagerImpl packager = new GraniteStonePackagerImpl();
        Stone stone = new Stone(packager);
        stone.startPackaging();
    }
}
