package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Wheatflour;

public class WheatflourRunner {
    public static void main(String[] args) {
        Wheatflour aashirvaadFlour = new Wheatflour("Aashirvaad", "Plastic Packet", 20.99);
        System.out.println(aashirvaadFlour);
        System.out.println("Custom hashCode (overridden): " + aashirvaadFlour.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(aashirvaadFlour));
    }
}

