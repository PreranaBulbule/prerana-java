package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Wheatflour;

public class WheatflourRunner {
    public static void main(String[] args) {
        Wheatflour aashirvaadFlour = new Wheatflour("Aashirvaad", "Plastic Packet", 20.99);
        System.out.println(aashirvaadFlour);
        System.out.println("Custom hashCode (overridden): " + aashirvaadFlour.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(aashirvaadFlour));

        Wheatflour w1 = new Wheatflour("Aashirvaad", "Plastic Packet", 20.99);
        Wheatflour w2 = new Wheatflour("Aashirvaad", "Plastic Packet", 20.99);
        boolean areSame = w1.equals(w2);
        System.out.println("Are both Wheatflour objects the same: " + areSame);

        Wheatflour w3 = new Wheatflour("Pillsbury", "Paper Packet", 25.99);
        boolean areDifferent = w1.equals(w3);
        System.out.println("Are both Wheatflour objects the same: " + areDifferent);
    }
}
