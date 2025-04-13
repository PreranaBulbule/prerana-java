package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Soap;

public class SoapRunner {
    public static void main(String[] args) {
        Soap doveSoap = new Soap("Dove", "Beauty Bar", 3.99);
        System.out.println(doveSoap);
        System.out.println("Custom hashCode (overridden): " + doveSoap.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(doveSoap));

        Soap s1 = new Soap("Dove", "Beauty Bar", 3.99);
        Soap s2 = new Soap("Dove", "Beauty Bar", 3.99);
        boolean same = s1.equals(s2);
        System.out.println("Both soaps are same: " + same);

        Soap s3 = new Soap("Lux", "Perfumed", 2.49);
        Soap s4 = new Soap("Dove", "Beauty Bar", 3.99);
        boolean different = s3.equals(s4);
        System.out.println("Both soaps are same: " + different);
    }
}
