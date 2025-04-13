package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Switch;

public class SwitchRunner {
    public static void main(String[] args) {
        Switch electricSwitch = new Switch("Electrical", "Philips", 5.99);
        System.out.println(electricSwitch);
        System.out.println("Custom hashCode (overridden): " + electricSwitch.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(electricSwitch));

        Switch s1 = new Switch("Electrical", "Philips", 5.99);
        Switch s2 = new Switch("Electrical", "Philips", 5.99);
        boolean same = s1.equals(s2);
        System.out.println("Both switches are same: " + same);

        Switch s3 = new Switch("Electrical", "Wipro", 6.99);
        boolean different = s1.equals(s3);
        System.out.println("Both switches are same: " + different);
    }
}
