package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Egg;
import com.xworkz.Interface.Internal.FreshEggPackagerImpl;

public class EggRunner {
    public static void main(String[] args) {
        FreshEggPackagerImpl packager = new FreshEggPackagerImpl();
        Egg egg = new Egg(packager);
        egg.startPackaging();
    }
}
