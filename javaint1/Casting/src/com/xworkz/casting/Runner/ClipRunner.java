package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Clip;

public class ClipRunner {
    public static void main(String[] args) {
        Clip paperClip = new Clip("Staples", "Silver", 10.00);
        System.out.println(paperClip);
        System.out.println("Custom hashCode (overridden): " + paperClip.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(paperClip));

        Clip clip1 = new Clip();
        clip1.setBrand("Staples");

        Clip clip2 = new Clip();
        clip2.setBrand("Staples");

        boolean same = clip1.equals(clip2);
        System.out.println("Both same brand: " + same);
    }
}

