package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Rose;
import com.xworkz.Interface.Internal.FreshRosePackagerImpl;

public class RoseRunner {
    public static void main(String[] args) {
        FreshRosePackagerImpl packager = new FreshRosePackagerImpl();
        Rose rose = new Rose(packager);
        rose.startPackaging();
    }
}
