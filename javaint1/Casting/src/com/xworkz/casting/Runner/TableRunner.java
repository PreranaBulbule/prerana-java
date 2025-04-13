package com.xworkz.casting.Runner;
import com.xworkz.casting.Internal.Table;

public class TableRunner {
    public static void main(String[] args) {
        Table diningTable = new Table("Dining Table", "Wood", 4999.99);
        System.out.println(diningTable);
        System.out.println("Custom hashCode (overridden): " + diningTable.hashCode());
        System.out.println("Original identityHashCode: " + System.identityHashCode(diningTable));

        Table t1 = new Table("Dining Table", "Wood", 4999.99);
        Table t2 = new Table("Dining Table", "Wood", 4999.99);
        boolean same = t1.equals(t2);
        System.out.println("Both tables are same: " + same);

        Table t3 = new Table("Coffee Table", "Glass", 2499.99);
        boolean different = t1.equals(t3);
        System.out.println("Both tables are same: " + different);
    }
}
