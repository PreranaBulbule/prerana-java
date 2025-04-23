package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Donut;
import com.xworkz.Interface.Internal.ChocolateDonutPackagerImpl;

public class DonutRunner {
    public static void main(String[] args) {
        ChocolateDonutPackagerImpl packager = new ChocolateDonutPackagerImpl();
        Donut donut = new Donut(packager);
        donut.startPackaging();
    }
}
