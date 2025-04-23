package com.xworkz.Interface.Runner;

import com.xworkz.Interface.External.Door;
import com.xworkz.Interface.Internal.WoodenDoorPackagerImpl;

public class DoorRunner {
    public static void main(String[] args) {
        WoodenDoorPackagerImpl packager = new WoodenDoorPackagerImpl();
        Door door = new Door(packager);
        door.startPackaging();
    }
}
