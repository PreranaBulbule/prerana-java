package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Bus;

public class BusRunner {
    public static void main(String[] args) {
        Bus cityBus = new Bus("42B", "City Bus", 25.00);
        System.out.println(cityBus);
    }
}

