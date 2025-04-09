package com.xworkz.casting.Runner;

import com.xworkz.casting.Internal.Soap;

public class SoapRunner {
    public static void main(String[] args) {
        Soap doveSoap = new Soap("Dove", "Beauty Bar", 3.99);
        System.out.println(doveSoap);
    }
}

