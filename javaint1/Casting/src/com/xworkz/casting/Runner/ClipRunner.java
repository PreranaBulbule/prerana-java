package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip paperClip = new Clip("Staples", "Silver", 10.00);
        System.out.println(paperClip);
        System.out.println("Custom hashCode (overridden): " + paperClip.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(paperClip));
    }
}
