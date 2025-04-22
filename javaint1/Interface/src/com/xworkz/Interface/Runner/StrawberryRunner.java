package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Strawberry;
import com.xworkz.Interface.Internal.FreshStrawberryPackagerImpl;

public class StrawberryRunner {
    public static void main(String[] args) {
        FreshStrawberryPackagerImpl packager = new FreshStrawberryPackagerImpl();
        Strawberry strawberry = new Strawberry(packager);
        strawberry.startPackaging();
    }
}
