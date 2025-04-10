package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Dustbin;

public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin plasticDustbin = new Dustbin("Plastic", "Blue", 50.0);
        System.out.println(plasticDustbin);
        System.out.println("Custom hashCode (overridden): " + plasticDustbin.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(plasticDustbin));
    }
}


