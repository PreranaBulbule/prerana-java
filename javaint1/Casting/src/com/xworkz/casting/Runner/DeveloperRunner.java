package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Developer;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer javaDeveloper = new Developer("John Doe", "Java", 80000.00);
        System.out.println(javaDeveloper);
        System.out.println("Custom hashCode (overridden): " + javaDeveloper.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(javaDeveloper));

        Developer dev1 = new Developer();
        dev1.setName("John Doe");

        Developer dev2 = new Developer();
        dev2.setName("John Doe");

        boolean same = dev1.equals(dev2);
        System.out.println("Both same developer name: " + same);
    }
}


