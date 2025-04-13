package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Tab;

public class TabRunner {
    public static void main(String[] args) {
        Tab samsungTab = new Tab("Samsung", "Galaxy Tab S7", 49999.99);
        System.out.println(samsungTab);
        System.out.println("Custom hashCode (overridden): " + samsungTab.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(samsungTab));

        Tab t1 = new Tab("Samsung", "Galaxy Tab S7", 49999.99);
        Tab t2 = new Tab("Samsung", "Galaxy Tab S7", 49999.99);
        boolean same = t1.equals(t2);
        System.out.println("Both tabs are same: " + same);

        Tab t3 = new Tab("Apple", "iPad Air", 54999.99);
        boolean different = t1.equals(t3);
        System.out.println("Both tabs are same: " + different);
    }
}
