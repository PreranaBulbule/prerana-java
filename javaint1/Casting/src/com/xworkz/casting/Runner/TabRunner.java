package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Tab;

public class TabRunner {
    public static void main(String[] args) {
        Tab samsungTab = new Tab("Samsung", "Galaxy Tab S7", 49999.99);
        System.out.println(samsungTab);
        System.out.println("Custom hashCode (overridden): " + samsungTab.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(samsungTab));
    }
}

