package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Pillow;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow memoryFoamPillow = new Pillow("Wakefit", "Memory Foam", 999.99);
        System.out.println(memoryFoamPillow);
        System.out.println("Custom hashCode (overridden): " + memoryFoamPillow.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(memoryFoamPillow));

        Pillow pillow1 = new Pillow("Wakefit", "Memory Foam", 999.99);
        Pillow pillow2 = new Pillow("Wakefit", "Memory Foam", 999.99);
        boolean areSame = pillow1.equals(pillow2);
        System.out.println("Are both pillows the same? " + areSame);

        Pillow pillow3 = new Pillow("Sleepwell", "Latex", 1299.99);
        boolean areDifferent = pillow1.equals(pillow3);
        System.out.println("Are both pillows the same? " + areDifferent);
    }
}
