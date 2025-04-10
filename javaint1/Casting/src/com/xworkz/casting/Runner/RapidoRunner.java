package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Rapido;

public class RapidoRunner {
    public static void main(String[] args) {
        Rapido bike = new Rapido("Honda Activa", "Black", 150.00);
        System.out.println(bike);
        System.out.println("Custom hashCode (overridden): " + bike.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(bike));
    }
}

