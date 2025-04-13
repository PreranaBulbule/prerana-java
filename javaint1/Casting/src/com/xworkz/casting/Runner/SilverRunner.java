package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Silver;

public class SilverRunner {
    public static void main(String[] args) {
        Silver sterlingSilver = new Silver("Sterling", 100.0, 80.00);
        System.out.println(sterlingSilver);
        System.out.println("Custom hashCode (overridden): " + sterlingSilver.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(sterlingSilver));

        Silver s1 = new Silver("Sterling", 100.0, 80.00);
        Silver s2 = new Silver("Sterling", 100.0, 80.00);
        boolean same = s1.equals(s2);
        System.out.println("Both silvers are same: " + same);

        Silver s3 = new Silver("925", 50.0, 40.00);
        Silver s4 = new Silver("Sterling", 100.0, 80.00);
        boolean different = s3.equals(s4);
        System.out.println("Both silvers are same: " + different);
    }
}
