package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Rapido;

public class RapidoRunner {
    public static void main(String[] args) {
        Rapido bike = new Rapido("Honda Activa", "Black", 150.00);
        System.out.println(bike);
        System.out.println("Custom hashCode (overridden): " + bike.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(bike));

        Rapido rapido1 = new Rapido("Honda Activa", "Black", 150.00);
        Rapido rapido2 = new Rapido("Honda Activa", "Black", 150.00);
        boolean same = rapido1.equals(rapido2);
        System.out.println("Both Rapido rides are same: " + same);

        Rapido rapido3 = new Rapido("TVS", "Red", 120.00);
        Rapido rapido4 = new Rapido("Suzuki", "White", 180.00);
        boolean different = rapido3.equals(rapido4);
        System.out.println("Both Rapido rides are same: " + different);
    }
}
