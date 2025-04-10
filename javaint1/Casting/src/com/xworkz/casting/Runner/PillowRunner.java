package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Pillow;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow memoryFoamPillow = new Pillow("Wakefit", "Memory Foam", 999.99);
        System.out.println(memoryFoamPillow);
        System.out.println("Custom hashCode (overridden): " + memoryFoamPillow.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(memoryFoamPillow));
    }
}

