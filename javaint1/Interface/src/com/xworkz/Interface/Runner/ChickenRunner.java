package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Chicken;
import com.xworkz.Interface.Internal.GrilledChickenPackagerImpl;

public class ChickenRunner {
    public static void main(String[] args) {
        GrilledChickenPackagerImpl packager = new GrilledChickenPackagerImpl();
        Chicken chicken = new Chicken(packager);
        chicken.startPackaging();
    }
}
