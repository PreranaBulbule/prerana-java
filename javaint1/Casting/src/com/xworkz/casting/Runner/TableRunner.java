package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Table;

public class TableRunner {
    public static void main(String[] args) {
        Table diningTable = new Table("Dining Table", "Wood", 4999.99);
        System.out.println(diningTable);
        System.out.println("Custom hashCode (overridden): " + diningTable.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(diningTable));
    }
}

