package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Developer;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer javaDeveloper = new Developer("John Doe", "Java", 80000.00);
        System.out.println(javaDeveloper);
        System.out.println("Custom hashCode (overridden): " + javaDeveloper.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(javaDeveloper));
    }
}

