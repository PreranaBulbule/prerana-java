package com.xworkz.Interface.Internal;

public class ElectricNexonPackagerImpl implements NexonPackager {
    public ElectricNexonPackagerImpl() {
        System.out.println("No-arg constructor of ElectricNexonPackagerImpl");
    }

    @Override
    public void pack() {
        System.out.println("Packing Nexon using Electric Nexon Packager");
    }
}
