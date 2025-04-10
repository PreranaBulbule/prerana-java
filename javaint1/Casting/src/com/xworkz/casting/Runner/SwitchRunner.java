package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Switch;

public class SwitchRunner {
    public static void main(String[] args) {
        Switch electricSwitch = new Switch("Electrical", "Philips", 5.99);
        System.out.println(electricSwitch);
        System.out.println("Custom hashCode (overridden): " + electricSwitch.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(electricSwitch));
    }
}

