package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Resort;

public class ResortRunner {
    public static void main(String[] args) {
        Resort beachResort = new Resort("Sunset Beach Resort", "Goa", 150.00);
        System.out.println(beachResort);
        System.out.println("Custom hashCode (overridden): " + beachResort.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(beachResort));

        Resort resort1 = new Resort("Sunset Beach Resort", "Goa", 150.00);
        Resort resort2 = new Resort("Sunset Beach Resort", "Goa", 150.00);
        boolean same = resort1.equals(resort2);
        System.out.println("Both resorts are same: " + same);

        Resort resort3 = new Resort("Hilltop Resort", "Manali", 250.00);
        Resort resort4 = new Resort("City Lights Resort", "Mumbai", 180.00);
        boolean different = resort3.equals(resort4);
        System.out.println("Both resorts are same: " + different);
    }
}
