package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Dustbin;

public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin plasticDustbin = new Dustbin("Plastic", "Blue", 50.0);
        System.out.println(plasticDustbin);
        System.out.println("Custom hashCode (overridden): " + plasticDustbin.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(plasticDustbin));

        Dustbin dustbin1 = new Dustbin("Plastic", "Blue", 50.0);
        Dustbin dustbin2 = new Dustbin("Plastic", "Blue", 50.0);
        boolean same = dustbin1.equals(dustbin2);
        System.out.println("Both dustbins are same: " + same);

        Dustbin dustbin3 = new Dustbin("Metal", "Green", 75.0);
        Dustbin dustbin4 = new Dustbin("Plastic", "Blue", 50.0);
        boolean different = dustbin3.equals(dustbin4);
        System.out.println("Both dustbins are same: " + different);
    }
}



